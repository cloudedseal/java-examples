package patterns.proxydelegate.demo6;

import patterns.proxydelegate.demo1.IGamePlayer;
import patterns.proxydelegate.demo4.GamePlayer;

/**
 * Provide a surrogate or placeholder for another object to control access to it
 * 控制对象的访问
 * 委托模式
 * 代理类
 */
public class GamePlayerProxy implements IGamePlayer, IProxy {
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(String name) {

        try {
            this.gamePlayer = new GamePlayer(this,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void login(String user, String password) {
        // 委托
        this.gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }

    @Override
    public void count() {
        System.out.println("升级费用 150CNY");
    }
}
