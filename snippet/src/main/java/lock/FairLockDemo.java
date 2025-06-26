package lock;

import java.util.concurrent.locks.ReentrantLock;

public class FairLockDemo {
    public static void main(String[] args) {
        ReentrantLock fairLock = new ReentrantLock(true); // Fair lock

        Runnable task = () -> {
            fairLock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " acquired the lock");
            } finally {
                fairLock.unlock();
            }
        };

        // Start 5 threads contending for the lock
        for (int i = 0; i < 50; i++) {
            new Thread(task).start();
        }
    }
}