package coroutine;

public class CoroutineSimulation {

    private volatile boolean pingTurn = true;

    public static void main(String[] args) {
        CoroutineSimulation game = new CoroutineSimulation();

        Thread ping = new Thread(game::ping, "Ping");
        Thread pong = new Thread(game::pong, "Pong");

        ping.start();
        pong.start();
    }

    public void ping() {
        for (int i = 1; i <= 5; i++) {
            synchronized (this) {
                while (!pingTurn) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                System.out.println(Thread.currentThread().getName() + " - Ping " + i);
                pingTurn = false;
                notify();
            }
        }
    }

    public void pong() {
        for (int i = 1; i <= 5; i++) {
            synchronized (this) {
                while (pingTurn) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                System.out.println(Thread.currentThread().getName() + " - Pong " + i);
                pingTurn = true;
                notify();
            }
        }
    }
}