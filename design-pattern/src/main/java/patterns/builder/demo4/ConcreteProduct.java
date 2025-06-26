package patterns.builder.demo4;

public class ConcreteProduct extends Builder{
    private Product product = new Product();

    @Override
    public void setPart() {
        // 产品类内的逻辑处理
    }

    @Override
    public Product buildProduct() {
        return this.product;
    }
}
