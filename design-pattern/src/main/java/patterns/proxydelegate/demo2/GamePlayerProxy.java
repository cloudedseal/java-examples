package patterns.proxydelegate.demo2;

import patterns.proxydelegate.demo1.IGamePlayer;

/**
 * Provide a surrogate or placeholder for another object to control access to it
 * 控制对象的访问
 * 委托模式
 * 代理类
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
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
    }
}
