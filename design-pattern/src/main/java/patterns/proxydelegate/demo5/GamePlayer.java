package patterns.proxydelegate.demo5;


/**
 * 被代理类
 */
public class GamePlayer implements IGamePlayer {
    private String name;
    // 我的代理是谁
    private IGamePlayer proxy = null;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        if (this.isProxy()){
            System.out.println("登录名" + user + "的用户" + name + "登录成功");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    private boolean isProxy() {
        if (this.proxy == null){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()){
            System.out.println(this.name + " 在打怪!");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()){
            System.out.println(this.name + " 又升了一级!");
        } else {
            System.out.println("请使用指定的代理访问");
        }

    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }
}
