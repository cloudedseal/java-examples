package patterns.bridge.demo3;

public class Clothes extends Product {
    public void beProduced() {
        System.out.println("生产出的衣服是这样的...");
    }


    public void beSelled() {
        System.out.println("生产出的衣服卖出去了...");
    }
}