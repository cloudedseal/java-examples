package patterns.command.demo4;

import patterns.command.demo3.ConcreteReceiver2;
import patterns.command.demo3.Receiver;

public class ConcreteCommand2 extends Command{

    public ConcreteCommand2() {
        super(new ConcreteReceiver2());
    }

    public ConcreteCommand2(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        super.receiver.doSomething();
    }
}
