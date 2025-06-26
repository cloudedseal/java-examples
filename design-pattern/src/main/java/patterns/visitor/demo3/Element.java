package patterns.visitor.demo3;

public abstract class Element {
    // 业务逻辑
    abstract void doSomething();
    // 允许谁来访问
    abstract void accept(IVisitor visitor);
}
