package pk.demo4.command;

/**
 * 调用者，供高层模块使用
 */
public class Invoker {
    private AbstractCmd cmd;

    public Invoker(AbstractCmd cmd) {
        this.cmd = cmd;
    }

    public boolean execute(String source,String to){
        return this.cmd.execute(source,to);
    }
}
