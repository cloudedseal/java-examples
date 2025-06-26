package pk.demo2.proxy;

import pk.demo2.IRunner;
import pk.demo2.Runner;

public class Client {
    public static void main(String[] args) {
        IRunner liu = new Runner();
        IRunner agent = new RunnerAgent(liu);
        agent.run();
    }
}
