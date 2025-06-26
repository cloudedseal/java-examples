package patterns.template.demo2;

/**
 * define the skeleton of an algorithm in an operation, deferring some steps to subclass.
 * Template method lets subclasses redefine certain steps of an algorithm without changing
 * the algorithm's structure.
 */
public abstract class HummerModel {

    /**
     * 延迟到子类实现，变化的部分
     */
    public abstract void start();

    /**
     * 延迟到子类实现，变化的部分
     */
    public abstract void stop();

    /**
     * 延迟到子类实现，变化的部分
     */
    public abstract void alarm();

    /**
     * 延迟到子类实现，变化的部分
     */
    public abstract void engineBoom();

    // 模版方法, 封装固定的流程, 算法框架。不变的部分
    // 调用子类实现的方法
    public void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
