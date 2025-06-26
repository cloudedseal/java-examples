package patterns.decorator.demo4;

public class ConcreteDecorator2 extends Decorator{
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    private void decorateMethod2(){
        System.out.println("decorateMethod2");
    }

    @Override
    public void operate() {
        super.operate();
        this.decorateMethod2();
    }
}
