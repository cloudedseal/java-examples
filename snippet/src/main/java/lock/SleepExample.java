package lock;

public class SleepExample {
    private final Object lock = new Object();

    public void threadA() {
        synchronized (lock) {
            System.out.println("Thread A acquired the lock");
            try {
                // Sleep for 5 seconds without releasing the lock
                Thread.sleep(10000);
                System.out.println("Thread A resumed execution");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread A exited the synchronized block");
    }

    public void threadB() {
        synchronized (lock) {
            System.out.println("Thread B trying to acquire the lock...");
            // This line will never execute because Thread A still holds the lock
            System.out.println("Thread B acquired the lock!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SleepExample example = new SleepExample();

        // Start Thread A (sleeps)
        Thread threadA = new Thread(example::threadA);
        threadA.start();

        // Start Thread B immediately after
        Thread threadB = new Thread(example::threadB);
        threadB.start();
        Thread.sleep(2000);
        System.out.println(threadA.getState());
    }
}