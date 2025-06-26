package io;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
import java.util.*;

public class ScatteringExample {

    public static void main(String[] args) throws IOException {
        // Simulate data: 4-byte header, 8-byte header, 3-byte body
        byte[] header1Data = new byte[] { 0x01, 0x02, 0x03, 0x04 };
        byte[] header2Data = new byte[] { 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C };
        byte[] bodyData = new byte[] { 0x0D, 0x0E, 0x0F };

        // Combine into a single byte array
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header1Data);
        baos.write(header2Data);
        baos.write(bodyData);
        byte[] allData = baos.toByteArray();

        // Write to a temporary file
        Path tempFile = Files.createTempFile("packet", ".bin");
        Files.write(tempFile, allData);

        // Read back using ScatteringByteChannel
        try (FileInputStream fis = new FileInputStream(tempFile.toFile());
             FileChannel channel = fis.getChannel()) {

            // Buffers for each segment
            ByteBuffer header1 = ByteBuffer.allocate(4);
            ByteBuffer header2 = ByteBuffer.allocate(8);
            ByteBuffer body = ByteBuffer.allocate(1024); // More than enough for body

            // Scattering read
            long bytesRead = channel.read(new ByteBuffer[]{header1, header2, body});
            System.out.println("Total bytes read: " + bytesRead);

            // Flip buffers to prepare for reading
            header1.flip();
            header2.flip();
            body.flip();

            // Print header 1
            System.out.print("Header 1: ");
            while (header1.hasRemaining()) {
                System.out.printf("%02X ", header1.get());
            }
            System.out.println();

            // Print header 2
            System.out.print("Header 2: ");
            while (header2.hasRemaining()) {
                System.out.printf("%02X ", header2.get());
            }
            System.out.println();

            // Print body
            System.out.print("Body: ");
            while (body.hasRemaining()) {
                System.out.printf("%02X ", body.get());
            }
            System.out.println();

        }

        // Clean up
        Files.deleteIfExists(tempFile);
    }
}