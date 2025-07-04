package patterns.factory.demo2;

public abstract class Creator {

    /**
     * 创建一个产品对象，输入参数可自行设置
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
