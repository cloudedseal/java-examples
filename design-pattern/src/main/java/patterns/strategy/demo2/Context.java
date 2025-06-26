package patterns.strategy.demo2;

/**
 * 封装角色
 */
public class Context {
    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 封装后的策略方法
     */
    public void doAnything(){
        this.strategy.doSomething();
    }
}
