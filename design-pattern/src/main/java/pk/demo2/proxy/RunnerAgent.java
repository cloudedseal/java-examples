package pk.demo2.proxy;

import pk.demo2.IRunner;

import java.util.Random;

/**
 * 代理加强对代理人的访问控制，怎样加强呢？实现一样的接口。在调用被代理人之前进行逻辑控制
 */
public class RunnerAgent implements IRunner {
    // 持有的被代理人
    private IRunner runner;

    public RunnerAgent(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        Random rand = new Random();
        if (rand.nextBoolean()){
            System.out.println("代理人同意安排运动员跑步");
            runner.run();
        } else {
            System.out.println("代理人不同意安排运动员跑步");
        }
    }
}
