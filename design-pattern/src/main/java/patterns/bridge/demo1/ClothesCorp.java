package patterns.bridge.demo1;

public class ClothesCorp extends Corp{
    @Override
    protected void produce() {
        System.out.println("服装公司生产衣服。。。");
    }

    @Override
    protected void sell() {
        System.out.println("服装公司卖衣服。。。");
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚小钱。。。");
    }
}
