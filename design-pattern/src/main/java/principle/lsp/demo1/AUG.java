package principle.lsp.demo1;

public class AUG extends Rifle{
    public void zoomOut(){
        System.out.println("通过望远镜看敌人。。。");
    }

    @Override
    public void shoot() {
        System.out.println("AUG 射击。。。");
    }
}
