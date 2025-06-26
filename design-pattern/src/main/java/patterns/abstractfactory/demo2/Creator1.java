package patterns.abstractfactory.demo2;

/**
 * 指创建等级1的产品
 */
public class Creator1 extends AbstractCreator{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
