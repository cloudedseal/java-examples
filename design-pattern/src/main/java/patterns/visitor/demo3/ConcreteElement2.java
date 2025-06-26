package patterns.visitor.demo3;

public class ConcreteElement2 extends Element{
    @Override
    void doSomething() {
        System.out.println("ConcreteElement2#doSomething");
    }

    @Override
    void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
