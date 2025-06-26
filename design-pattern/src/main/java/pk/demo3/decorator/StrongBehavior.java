package pk.demo3.decorator;

public class StrongBehavior extends Decorator{
    public StrongBehavior(Swan swan) {
        super(swan);
    }

    @Override
    public void fly() {
        System.out.println("会飞行了");
    }
}
