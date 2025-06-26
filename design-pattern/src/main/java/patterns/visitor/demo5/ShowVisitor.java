package patterns.visitor.demo5;

import patterns.visitor.demo4.CommonEmployee;
import patterns.visitor.demo4.Employee;
import patterns.visitor.demo4.Manager;

public class ShowVisitor implements IShowVisitor{
    private String info = "";

    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.info = this.info + this.getBasicInfo(commonEmployee)
                + "工作："+commonEmployee.getJob()+"\t\n";
    }

    @Override
    public void visit(Manager manager) {
        this.info = this.info + this.getBasicInfo(manager) + "业绩： "+manager.getPerformance() + "\t\n";
    }

    @Override
    public int getTotalSalary() {
        return 0;
    }

    @Override
    public void report() {
        System.out.println(this.info);
    }

    //组装出基本信息
    private String getBasicInfo(Employee employee){
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == Employee.FEMALE?"女":
                "男") + "\t";
        info = info + "薪水：" + employee.getSalary() + "\t";
        return info;
    }
}
