package principle.srp.demo2;

/**
 * 协议管理 dial 和 hangup 变化会引起这个接口或者实现类变化么？会
 * 数据传输 chat 变化会引起这个接口或者实现类变化么？会
 */
public interface IPhone {
    // 协议管理
    void dial(String phoneNumber);
    // 数据传输
    void chat(Object o);
    // 协议管理
    void hangup();
}
