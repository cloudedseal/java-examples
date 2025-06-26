package patterns.proxydelegate.demo5;

public interface IGamePlayer {
    void login(String user, String password);
    void killBoss();
    void upgrade();
    // 强制代理
    IGamePlayer getProxy();
}
