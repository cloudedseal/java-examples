package patterns.visitor.demo2;



/**
 * 访问者-访问谁
 * Represent an operation to be performed on the elements of an object structure.
 * Visitor lets you define a new operation without changing the classes of the elements on which it operates.
 * 定义新的操作
 */
public interface IVisitor {
    // 具体的类
    void visit(CommonEmployee commonEmployee);
    // 具体的类
    void visit(Manager manager);
}
