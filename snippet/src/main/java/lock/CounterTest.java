package lock;

import java.util.concurrent.Semaphore;

public class CounterTest {
    Semaphore mutex = new Semaphore(1);
    private int count;
    public void add(){
        try {
            mutex.acquire(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.count++;
        mutex.release();
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        CounterTest counterTest = new CounterTest();
        Thread thread = new Thread(()->{
            for (int i = 0; i < 10000 ; i++) {
              counterTest.add();
            }
//            System.out.println("thread end");
        });

        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 10000 ; i++) {
                counterTest.add();
            }
//            System.out.println("thread2 end");
        });

        Thread thread3 = new Thread(()->{
            for (int i = 0; i < 10000 ; i++) {
                counterTest.add();
            }
//            System.out.println("thread3 end");
        });

       thread.start();
       thread2.start();
       thread3.start();
       thread.join();
       thread2.join();
       thread3.join();
        System.out.println(counterTest.getCount());
    }
}
