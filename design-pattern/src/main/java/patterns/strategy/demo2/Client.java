package patterns.strategy.demo2;

public class Client {
    public static void main(String[] args) {
        // 声明一个策略, 需要知道使用哪一个策略
        Strategy strategy = new ConcreteStrategy1();

        // 声明上下文
        Context context = new Context(strategy);
        context.doAnything();
    }
}
