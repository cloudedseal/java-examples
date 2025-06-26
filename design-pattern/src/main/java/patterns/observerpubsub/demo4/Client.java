package patterns.observerpubsub.demo4;

public class Client {
    public static void main(String[] args) {
        // 被观察者
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer = new ConcreteObserver();

        subject.addObserver(observer);
        subject.doSomething();
    }
}
