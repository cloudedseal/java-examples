package patterns.proxydelegate.demo1;

/**
 * 被代理类
 */
public class GamePlayer implements IGamePlayer{
    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名" + user + "的用户" + name + "登录成功");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + " 在打怪!");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " 又升了一级!");
    }
}
