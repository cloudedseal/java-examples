package patterns.command.demo2;

public class Client {
    public static void main(String[] args) {
        Invoker shogun = new Invoker();
        System.out.println("增加一个需求");
        Command command = new AddRequirementCommand();
        shogun.setCommand(command);
        shogun.action();

        // 删除一个页面
        command = new DeletePageCommand();
        shogun.setCommand(command);
        shogun.action();
    }
}
