package patterns.flyweight.demo3;

import java.util.HashMap;

/**
 * 享元工厂
 */
public class FlyweightFactory {
    private static HashMap<String,Flyweight> pool = new HashMap<>();

    public static Flyweight getFlyweight(String extrinsic){
        Flyweight flyweight = null;
        if (pool.containsKey(extrinsic)){
            flyweight = pool.get(extrinsic);
        } else {
            flyweight = new ConcreteFlyweight1(extrinsic);
            pool.put(extrinsic,flyweight);
        }

        return flyweight;
    }
}
