package patterns.visitor.demo3;

public class ConcreteElement1 extends Element{
    @Override
    void doSomething() {
        System.out.println("ConcreteElement1#doSomething");
    }

    @Override
    void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
