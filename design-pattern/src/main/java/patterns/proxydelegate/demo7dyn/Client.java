package patterns.proxydelegate.demo7dyn;


import patterns.proxydelegate.demo1.GamePlayer;
import patterns.proxydelegate.demo1.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) throws Exception {
        IGamePlayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayIH(player);
        ClassLoader cl = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl,new Class[]{IGamePlayer.class} ,handler);
        proxy.login("zhangsan","pwd");
        proxy.killBoss();
        proxy.upgrade();
    }
}
