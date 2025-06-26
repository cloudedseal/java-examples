package patterns.proxydelegate.demo4;

import patterns.proxydelegate.demo1.IGamePlayer;

public class Client {
    public static void main(String[] args) {
        // 只需要知道代理即可，屏蔽真实角色
        IGamePlayer proxy = new GamePlayerProxy("张三");
        proxy.login("zhangsan","pwd");
        proxy.killBoss();
        proxy.upgrade();
    }
}
