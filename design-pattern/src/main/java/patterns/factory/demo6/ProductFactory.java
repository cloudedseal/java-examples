package patterns.factory.demo6;

import patterns.factory.demo2.ConcreteProduct1;
import patterns.factory.demo2.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * 何为延迟初始化（Lazy initialization）？
 * 一个对象被消费完毕后，并不立刻释放，工厂类
 * 保持其初始状态，等待再次被使用。
 * 存在立刻返回，不存在才初始化
 */
public class ProductFactory {
    private static final Map<String, Product> prMap = new HashMap<>();
    public static synchronized Product createProduct(String type){
        Product product = null;
        if (prMap.containsKey(type)){
            return prMap.get(type);
        } else {
            if (type.equals("Product1")){
                product = new ConcreteProduct1();
            }
            prMap.put(type,product);
        }
        return product;
    }
}
