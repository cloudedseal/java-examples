package pk.demo1.absfactory;

/**
 * 一个产品线一个工厂
 */
public class BMWFactory implements CarFactory{
    @Override
    public ICar createSuv() {
        return new BMWSuv();
    }

    @Override
    public ICar createVan() {
        return new BMWVan();
    }
}
