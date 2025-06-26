package lock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExample {
    private final Object lock = new Object();
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void threadA() {
        synchronized (lock) {
            System.out.println("Thread A acquired the lock and is waiting for input:");
            try {
                // Blocking I/O operation (reads until EOF)
                String line = reader.readLine();
                System.out.println("Thread A received input: " + line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread A exited the synchronized block");
    }

    public void threadB() {
        synchronized (lock) {
            System.out.println("Thread B trying to acquire the lock...");
            // Blocked until Thread A completes I/O and exits the block
            System.out.println("Thread B acquired the lock!");
        }
    }

    public static void main(String[] args) {
        IOExample example = new IOExample();

        // Start Thread A (blocks on I/O)
        new Thread(example::threadA).start();

        // Start Thread B immediately after
        new Thread(example::threadB).start();
    }
}