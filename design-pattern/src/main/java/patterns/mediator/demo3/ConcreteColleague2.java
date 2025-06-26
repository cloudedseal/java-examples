package patterns.mediator.demo3;


public class ConcreteColleague2 extends Colleague{
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod1(){
        System.out.println("ConcreteColleague1#自有方法");
    }

    public void depMethod1(){
        // 委托给中介者
        super.mediator.doSomething2();
    }
}
