package lock;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    static Lock lock = new ReentrantLock(true);

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            System.out.println("start...");
            lock.lock();
            try {
                TimeUnit.SECONDS.sleep(30);
                System.out.println("abcd" + lock.hashCode());
            } catch (InterruptedException e) {
                System.out.println("thread was interrupt");
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        },"Thread1");

        Thread thread2 = new Thread(()->{
            lock.lock();
            int times = 10;
            try {
                TimeUnit.SECONDS.sleep(20);
                for (int i = 0; i < times; i++) {
                    lock.lock();
                }
                System.out.println("efgh" + lock.hashCode());
            } catch (InterruptedException e) {
                System.out.println("thread was interrupt");
                e.printStackTrace();
            }finally {
                for (int i = 0; i < times; i++) {
                    lock.unlock();
                }
                lock.unlock();
            }
        },"Thread2");

        Thread thread3 = new Thread(()->{
            lock.lock();
            int times = 10;
            try {
                TimeUnit.SECONDS.sleep(10);
                System.out.println("xyz" + lock.hashCode());
            } catch (InterruptedException e) {
                System.out.println("thread was interrupt");
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        },"Thread3");




        thread.start();
        thread2.start();
        thread3.start();

        thread.join();
        thread2.join();
        thread3.join();
        System.out.println("5555555555555");


    }


}
