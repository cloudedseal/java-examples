package patterns.decorator.demo4;

public class ConcreteDecorator1 extends Decorator{
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    private void decorateMethod1(){
        System.out.println("decorateMethod1");
    }

    @Override
    public void operate() {
        this.decorateMethod1();
        super.operate();
    }
}
