package patterns.visitor.demo5;

import patterns.visitor.demo4.IVisitor;

public interface ITotalVisitor extends IVisitor {
    // 统计所有员工工资总和
    void totalSalary();
}
