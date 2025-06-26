package lock;

public class MainTest implements Runnable {
    private int b = 0;
    public synchronized void test1() throws InterruptedException {
        System.out.print("test1 " + Integer.toHexString(this.hashCode()));
        b = 20;
        Thread.sleep(1000L);

    }
    public synchronized void test2() throws InterruptedException {
        System.out.print("test2 " + Integer.toHexString(this.hashCode()));
        b = 40;
        Thread.sleep(1000L);
    }
    public static void main(String args[]) throws InterruptedException {
        MainTest test = new MainTest();
        Thread thread = new Thread(test);
        thread.setName("thread-test1");
        thread.start();
        test.test2();
    }
    @Override
    public void run() {
        try {
            test1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}