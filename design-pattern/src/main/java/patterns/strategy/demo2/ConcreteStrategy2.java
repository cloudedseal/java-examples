package patterns.strategy.demo2;

public class ConcreteStrategy2 implements Strategy{
    @Override
    public void doSomething() {
        System.out.println("具体策略2的运算法则");
    }
}
