package patterns.observerpubsub.demo4;

public class ConcreteObserver implements Observer{
    @Override
    public void update() {
        System.out.println("收到信息，并进行处理！");
    }
}
