package patterns.bridge.demo3;

/**
 * 桥墩1
 */
public abstract class Corp {
    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney(){
        this.product.beProduced();
        this.product.beSelled();
    }
}
