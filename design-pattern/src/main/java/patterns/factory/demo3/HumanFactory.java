package patterns.factory.demo3;


import patterns.factory.demo1.Human;

/**
 * 静态工厂模式
 * 简单工厂模式
 */
public class HumanFactory{
    public static <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            // 实例化延迟到调用 createHuman
            human = (T)Class.forName(c.getName()).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println("人种生成错误");
        }
        return (T) human;
    }
}
