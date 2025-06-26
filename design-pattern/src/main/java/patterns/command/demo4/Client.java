package patterns.command.demo4;



public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command concreteCommand1 = new ConcreteCommand1();
        invoker.setCommand(concreteCommand1);
        invoker.action();
    }
}
