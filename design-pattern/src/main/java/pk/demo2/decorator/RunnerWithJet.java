package pk.demo2.decorator;

import pk.demo2.IRunner;

public class RunnerWithJet implements IRunner {
    // 持有被装饰者
    private IRunner runner;

    public RunnerWithJet(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        System.out.println("加快运动员速度：为运动员增加喷气装置");
        runner.run();
    }
}
