package patterns.strategy.demo1;

/**
 * Define a family of algorithms, encapsulate each one,
 * and make them interchangeable.
 * 实现同一个接口 interchangeable
 * 一组算法 每一个 IStrategy 实现
 * 封装 Context 类
 */
public interface IStrategy {
    void operate();
}
