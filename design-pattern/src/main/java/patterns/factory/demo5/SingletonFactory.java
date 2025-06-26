package patterns.factory.demo5;

import patterns.singleton.demo2.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
            Class<?> clz = Class.forName(Singleton.class.getName());
            Constructor<?> cons = clz.getDeclaredConstructor();
            cons.setAccessible(true);
            singleton = (Singleton) cons.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}
