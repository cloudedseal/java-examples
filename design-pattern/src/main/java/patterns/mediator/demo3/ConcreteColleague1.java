package patterns.mediator.demo3;


public class ConcreteColleague1 extends Colleague{
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod1(){
        System.out.println("ConcreteColleague1#自有方法");
    }

    public void depMethod1(){
        // 委托给中介者
        super.mediator.doSomething1();
    }
}
