package lock;

import java.util.concurrent.locks.LockSupport;

public class ParkExample2 {
    private static Object blocker = new Object();
    static Thread thread;
    public static void main(String[] args) throws InterruptedException {
        Task target = new Task();
        thread = new Thread(target);
        thread.start();
        // Current thread blocks here (if no permit is available).
        System.out.println("before park===>" + thread.getState().name());
        target.setPark(true);
        Thread.sleep(4000);
        System.out.println("after  parkNanos===>" + thread.getState().name());
        System.out.println(thread.getState().name());
        Thread.sleep(4000);
        thread.interrupt();
//        LockSupport.unpark(thread);
        target.setPark(false);
        System.out.println("after unpark===>" + thread.getState().name());
    }

    static class Task implements Runnable{
        boolean park;

        public boolean isPark() {
            return park;
        }

        public void setPark(boolean park) {
            this.park = park;
        }

        @Override
        public void run() {
            while (true){
                if (park){
                    System.out.println("////////////////////");
                    LockSupport.parkNanos(10000);
                    System.out.println("................");
                }
//                System.out.println("....");
            }
        }
    }
}