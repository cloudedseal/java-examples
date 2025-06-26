package lock;

public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        thread.start();
        thread.interrupt();
        System.out.println(thread.isInterrupted());
        System.out.println(thread.isInterrupted());
    }
}
