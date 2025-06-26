package lock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity;
    private final Lock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public void put(int item) throws InterruptedException {
        lock.lock();
        try {
            while (buffer.size() == capacity) {
                System.out.println("Buffer full, producer waiting...");
                notFull.await();
            }
            buffer.add(item);
            System.out.println("Produced: " + item + " | Buffer size: " + buffer.size());
            notEmpty.signal(); // Signal consumer that buffer isn't empty
        } finally {
            lock.unlock();
        }
    }

    public int take() throws InterruptedException {
        lock.lock();
        try {
            while (buffer.isEmpty()) {
                System.out.println("Buffer empty, consumer waiting...");
                notEmpty.await();
            }
            int item = buffer.remove();
            System.out.println("Consumed: " + item + " | Buffer size: " + buffer.size());
            notFull.signal(); // Signal producer that buffer isn't full
            return item;
        } finally {
            lock.unlock();
        }
    }
}

class Producer implements Runnable {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.put(i);
                Thread.sleep(100); // Simulate production time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.take();
                Thread.sleep(150); // Simulate consumption time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ConditionVariableExample {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(2); // Buffer capacity of 3
        new Thread(new Producer(buffer)).start();
        new Thread(new Consumer(buffer)).start();
    }
}