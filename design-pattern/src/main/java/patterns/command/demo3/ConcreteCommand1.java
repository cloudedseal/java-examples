package patterns.command.demo3;

public class ConcreteCommand1 extends Command{
    // 对哪个 Receiver 类进行命令处理
    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 委托给 Receiver
        this.receiver.doSomething();
    }
}
