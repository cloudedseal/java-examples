package patterns.template.demo4;

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
    public void run() {
        this.start();
        this.engineBoom();
        if (this.isAlarm()){
            this.alarm();
        }
        this.stop();
    }

    // 钩子方法
    protected  boolean isAlarm(){
        return true;
    }
}
