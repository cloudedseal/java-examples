package patterns.proxydelegate.demo4;

import patterns.proxydelegate.demo1.IGamePlayer;

public class GamePlayer implements IGamePlayer {
    private String name = "";

    public GamePlayer(IGamePlayer gamePlayer, String name) throws Exception {
        if (gamePlayer == null){
            throw new Exception("不能创建真实角色");
        } else {
            this.name = name;
        }
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
