package patterns.command.demo1;

public class Client {

    public static void main(String[] args) {
        System.out.println("-----------客户要求增加一项需求---------------");
        Group rg = new RequirementGroup();
//找到需求组
        rg.find();
//增加一个需求
        rg.add();
//要求变更计划
        rg.plan();
    }


}
