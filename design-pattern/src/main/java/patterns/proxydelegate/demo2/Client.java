package patterns.proxydelegate.demo2;

import patterns.proxydelegate.demo1.GamePlayer;
import patterns.proxydelegate.demo1.IGamePlayer;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = new GamePlayerProxy(player);
        proxy.login("zhangsan","pwd");
        proxy.killBoss();
        proxy.upgrade();
    }
}
