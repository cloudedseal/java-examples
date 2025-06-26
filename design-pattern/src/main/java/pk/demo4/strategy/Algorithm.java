package pk.demo4.strategy;

/**
 * 一组功能类似的算法
 */
public interface Algorithm {
    boolean compress(String source,String to);
    boolean uncompress(String source,String to);
}
