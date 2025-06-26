package io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class RobustTcpServer {
    private final int port;

    public RobustTcpServer(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        Selector selector = Selector.open();
        ServerSocketChannel serverChannel = ServerSocketChannel.open();
        serverChannel.bind(new InetSocketAddress(port));
        serverChannel.configureBlocking(false);
        ServerInfo serverInfo = new ServerInfo("1", new Date());
        serverChannel.register(selector, SelectionKey.OP_ACCEPT,serverInfo);

        System.out.println("TCP Server started on port " + port);

        while (true) {
            selector.select();
            Set<SelectionKey> keys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = keys.iterator();

            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                iterator.remove();

                if (key.isAcceptable()) {
                    acceptClient(key, selector);
                } else if (key.isReadable()) {
                    readClientData(key);
                } else if (key.isWritable()) {
                    writeClientData(key);
                }
            }
        }
    }

    private void acceptClient(SelectionKey key, Selector selector) throws IOException {
        ServerSocketChannel serverChannel = (ServerSocketChannel) key.channel();
        System.out.println(key.attachment().hashCode() + ":" + key.attachment().toString());
        SocketChannel clientChannel = serverChannel.accept();
        clientChannel.configureBlocking(false);
        clientChannel.register(selector, SelectionKey.OP_READ, ByteBuffer.allocateDirect(8192));
        System.out.println("New client connected: " + clientChannel.getRemoteAddress());
    }

    private void readClientData(SelectionKey key) throws IOException {
        SocketChannel channel = (SocketChannel) key.channel();
        ByteBuffer buffer = (ByteBuffer) key.attachment();

        try {
            int numRead = channel.read(buffer);
            if (numRead == -1) {
                System.out.println("Client disconnected: " + channel.getRemoteAddress());
                channel.close();
                key.cancel();
                return;
            }
            System.out.println("Read " + numRead + " bytes from client");

            buffer.flip();
            key.interestOps(SelectionKey.OP_WRITE);
        } catch (IOException e) {
            System.err.println("Error reading from client: " + e.getMessage());
            channel.close();
            key.cancel();
        }
    }

    private void writeClientData(SelectionKey key) throws IOException {
        SocketChannel channel = (SocketChannel) key.channel();
        ByteBuffer buffer = (ByteBuffer) key.attachment();

        try {
            int numWritten = channel.write(buffer);
            System.out.println("Wrote " + numWritten + " bytes to client");

            if (!buffer.hasRemaining()) {
                buffer.clear();
                key.interestOps(SelectionKey.OP_READ);
            }
        } catch (IOException e) {
            System.err.println("Error writing to client: " + e.getMessage());
            channel.close();
            key.cancel();
        }
    }

    public static void main(String[] args) throws IOException {
        new RobustTcpServer(8080).start();
    }
}