package patterns.bridge.demo3;

public class IPod extends Product {


    @Override
    public void beProduced() {
        System.out.println("生产出的iPod是这样的...");
    }

    @Override
    public void beSelled() {
System.out.println("生产出的iPod卖出去了...");
}
}