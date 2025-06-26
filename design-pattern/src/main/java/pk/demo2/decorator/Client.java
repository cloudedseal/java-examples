package pk.demo2.decorator;

import pk.demo2.IRunner;
import pk.demo2.Runner;

public class Client {
    public static void main(String[] args) {
        IRunner runner = new Runner();
        IRunner runner1 = new RunnerWithJet(runner);
        IRunner runner2 = new RunnerWithRocket(runner1);
        runner2.run();
    }
}
