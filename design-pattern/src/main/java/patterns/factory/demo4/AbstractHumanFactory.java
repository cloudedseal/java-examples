package patterns.factory.demo4;


import patterns.factory.demo1.Human;

/**
 * 多工厂, 一个产品一个工厂，维护成本高
 */
public abstract class AbstractHumanFactory {
    public abstract Human createHuman();
}
