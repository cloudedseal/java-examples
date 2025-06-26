package lock;

public class WaitExample {
    private final Object lock = new Object();
    private boolean ready = false;

    public void threadA() {
        synchronized (lock) {
            System.out.println("Thread A acquired the lock");
            try {
                // Voluntarily release the lock and wait for notification
                lock.wait();
                System.out.println("Thread A resumed execution");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread A exited the synchronized block");
    }

    public void threadB() {
        synchronized (lock) {
            System.out.println("Thread B acquired the lock");
            ready = true;
            // Notify waiting threads
            lock.notify();
            System.out.println("Thread B exited the synchronized block");
        }
    }

    public static void main(String[] args) {
        WaitExample example = new WaitExample();

        // Start Thread A (waits)
        new Thread(example::threadA).start();

        // Sleep to allow Thread A to acquire the lock
        try { Thread.sleep(100); } catch (InterruptedException e) {}

        // Start Thread B (notifies)
        new Thread(example::threadB).start();
    }
}