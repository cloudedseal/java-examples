package patterns.strategy.demo1;

public class Context {
    // 使用哪个计策
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate(){
        this.strategy.operate();
    }
}
