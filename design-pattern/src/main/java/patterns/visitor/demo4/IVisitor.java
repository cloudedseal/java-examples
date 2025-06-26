package patterns.visitor.demo4;



public interface IVisitor {
    void visit(CommonEmployee commonEmployee);
    void visit(Manager manager);
    int getTotalSalary();
}
