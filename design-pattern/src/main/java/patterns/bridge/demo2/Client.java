package patterns.bridge.demo2;

import patterns.bridge.demo1.HouseCorp;

public class Client {
    public static void main(String[] args) {
        System.out.println("-------房地产公司是按这样运行的-------");
//先找到我的公司
        HouseCorp houseCorp =new HouseCorp();
//看我怎么挣钱
        houseCorp.makeMoney();
        System.out.println("\n");
        System.out.println("-------山寨公司是按这样运行的-------");
        IPodCorp iPodCorp = new IPodCorp();
        iPodCorp.makeMoney();
    }
}
