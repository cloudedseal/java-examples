package patterns.proxydelegate.demo5;


public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        player.login("zhangsan","pwd");
        player.killBoss();
        player.upgrade();

        System.out.println("------------");
        IGamePlayer proxy = new GamePlayerProxy(player);
        proxy.login("zhangsan","pwd");
        proxy.killBoss();
        proxy.upgrade();

        System.out.println("------------");
        proxy = proxy.getProxy();
        proxy.login("zhangsan","pwd");
        proxy.killBoss();
        proxy.upgrade();

        System.out.println("------------");
        proxy = player.getProxy();
        proxy.login("zhangsan","pwd");
        proxy.killBoss();
        proxy.upgrade();
    }
}
