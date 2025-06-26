package patterns.command.demo3;

public class ConcreteCommand2 extends Command{
    // 对哪个 Receiver 类进行命令处理
    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
