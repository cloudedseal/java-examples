package patterns.visitor.demo3;

public interface IVisitor {
    // 具体元素对访问者公开细节
    void visit(ConcreteElement1 el1);
    void visit(ConcreteElement2 el2);
}
