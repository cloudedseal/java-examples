package patterns.abstractfactory.demo2;

/**
 * 指创建等级2的产品
 */
public class Creator2 extends AbstractCreator{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
