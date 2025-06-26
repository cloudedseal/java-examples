package patterns.command.demo2;

/**
 * 负责人, 负责执行客户命令
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    // 执行客户的命令

    public void action(){
        this.command.execute();
    }
}
