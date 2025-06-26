package patterns.bridge.demo3;

public class House extends Product{
    @Override
    public void beProduced() {
        System.out.println("生产出的房子是这样的。。。");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出去了。。。");
    }
}
