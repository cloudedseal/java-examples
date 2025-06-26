package pk.demo4.strategy;

/**
 * 提供和策略一样的方法，直接委托给真正的策略
 */
public class Context{
    // 具体的算法
    private Algorithm algorithm;

    public Context(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public boolean compress(String source, String to) {
        return this.algorithm.compress(source,to);
    }

    public boolean uncompress(String source, String to) {
        return this.algorithm.compress(source,to);
    }
}
