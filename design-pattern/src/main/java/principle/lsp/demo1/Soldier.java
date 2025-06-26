package principle.lsp.demo1;

/**
 * 编写程序时，无法知道使用哪种 gun
 */
public class Soldier {
    private AbstractGun gun;

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killEnemy(){
        System.out.println("士兵开始杀敌人。。。");
        gun.shoot();
    }
}
