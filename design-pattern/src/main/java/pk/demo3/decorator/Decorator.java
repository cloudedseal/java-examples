package pk.demo3.decorator;

public class Decorator implements Swan{
    // 被装饰的对象
    private Swan swan;

    public Decorator(Swan swan) {
        this.swan = swan;
    }

    @Override
    public void fly() {
        this.swan.fly();
    }

    @Override
    public void cry() {
        this.swan.cry();
    }

    @Override
    public void desAppearance() {
        this.swan.desAppearance();
    }
}
