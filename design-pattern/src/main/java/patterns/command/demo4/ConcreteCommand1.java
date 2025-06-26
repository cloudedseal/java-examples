package patterns.command.demo4;

import patterns.command.demo3.ConcreteReceiver1;
import patterns.command.demo3.Receiver;

public class ConcreteCommand1 extends Command{

    public ConcreteCommand1() {
        super(new ConcreteReceiver1());
    }

    public ConcreteCommand1(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        super.receiver.doSomething();
    }
}
