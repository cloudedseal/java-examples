package patterns.proxydelegate.demo1;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        player.login("zhangsan","pwd");
        player.killBoss();
        player.upgrade();
    }
}
