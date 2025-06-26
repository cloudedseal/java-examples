package pk.demo4.command;

/**
 * 接收者要做什么事情,真正的执行者
 */
public interface IReceiver {
    boolean compress(String source,String to);
    boolean uncompress(String source,String to);
}
