package patterns.command.demo4;

import patterns.command.demo3.Receiver;

public abstract class Command {
//定义一个子类的全局共享变量
protected final Receiver receiver;
//实现类必须定义一个接收者
public Command(Receiver receiver){
this.receiver = receiver;
}
//每个命令类都必须有一个执行命令的方法
public abstract void execute();
}