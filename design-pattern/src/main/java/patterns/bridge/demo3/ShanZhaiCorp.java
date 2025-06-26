package patterns.bridge.demo3;

/**
 * 桥？
 */
public class ShanZhaiCorp extends Corp{
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("赚钱呀。。。");
    }
}
