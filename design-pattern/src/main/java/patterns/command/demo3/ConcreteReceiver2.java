package patterns.command.demo3;

public class ConcreteReceiver2 extends Receiver{
    @Override
    public void doSomething() {
        System.out.println("ConcreteReceiver2#doSomething");
    }
}
