package patterns.factory.demo1;


public abstract class AbstractHumanFactory {
    // T extends Human   extends from 即是某个未命名的 Human 实现类，可以视为 UnknownHuman
    // T extends Human 理解成 UnknownHuman 这个类
    public abstract <T extends Human> T createHuman(Class<T> c);
}
