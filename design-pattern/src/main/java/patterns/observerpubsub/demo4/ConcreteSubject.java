package patterns.observerpubsub.demo4;

public class ConcreteSubject extends Subject{
    public void doSomething(){
        super.notifyObservers();
    }
}
