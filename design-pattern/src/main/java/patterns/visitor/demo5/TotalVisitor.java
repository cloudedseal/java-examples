package patterns.visitor.demo5;

import patterns.visitor.demo4.CommonEmployee;
import patterns.visitor.demo4.Manager;

public class TotalVisitor implements ITotalVisitor{

    //部门经理的工资系数是5
    private final static int MANAGER_COEFFICIENT = 5;
    //员工的工资系数是2
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
    //普通员工的工资总和
    private int commonTotalSalary = 0;
    //部门经理的工资总和
    private int managerTotalSalary =0;
    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.commonTotalSalary += commonEmployee.getSalary();
    }

    @Override
    public void visit(Manager manager) {
        this.managerTotalSalary += manager.getSalary();
    }

    @Override
    public int getTotalSalary() {
        return 0;
    }

    @Override
    public void totalSalary() {
        int i = this.commonTotalSalary + this.managerTotalSalary;
        System.out.println("公司工资总额" + i);
    }
}
