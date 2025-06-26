package patterns.visitor.demo3;

/**
 * 具体的访问者
 */
public class Visitor implements IVisitor{
    @Override
    public void visit(ConcreteElement1 el1) {
        System.out.println("Visitor 访问 ConcreteElement1");
        el1.doSomething();
        System.out.println("------");
    }

    @Override
    public void visit(ConcreteElement2 el2) {
        System.out.println("Visitor 访问 ConcreteElement2");
        el2.doSomething();
        System.out.println("------");
    }
}
