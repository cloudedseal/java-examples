package patterns.factory.demo1;


/**
 * Define an interface for creating an object,but let subclasses decide which class to instantiate.
 * Factory method lets a class defer instantiation to subclasses
 *
 * 定义一个创建 object 的接口，但是让子类决定实例化哪一个 class
 *
 * 隔离创建产品这个变化
 *
 *
 *  对扩展开放，新增的人种，无需修改工厂类
 *
 */
public class HumanFactory extends AbstractHumanFactory{
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
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
