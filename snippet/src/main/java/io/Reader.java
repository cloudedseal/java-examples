package io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Reader {

    public static void main(String[] args) throws IOException {
        FileChannel fileChannel = new RandomAccessFile(new File("/etc/services"), "rw").getChannel();

        ByteBuffer  heapByteBuffer1 = ByteBuffer.allocate(4096);
        ByteBuffer heapByteBuffer2 = ByteBuffer.allocate(4096);

        ByteBuffer[] scatter = { heapByteBuffer1, heapByteBuffer2 };

        fileChannel.read(scatter);

    }
}
