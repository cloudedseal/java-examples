package patterns.command.demo3;

public class Client {
    public static void main(String[] args) {
        // 调用者
        Invoker invoker = new Invoker();
        // 接收者
        Receiver receiver = new ConcreteReceiver1();
        // 通过 command 来解耦
        ConcreteCommand1 command1 = new ConcreteCommand1(receiver);
        invoker.setCommand(command1);
        invoker.action();
    }
}
