package patterns.bridge.demo1;

public class HouseCorp extends Corp{
    @Override
    protected void produce() {
        System.out.println("房地产公司盖房子。。。");
    }

    @Override
    protected void sell() {
        System.out.println("房地产公司卖房子。。。");
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了。。。");
    }
}
