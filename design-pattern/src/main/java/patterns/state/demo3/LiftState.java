package patterns.state.demo3;

/**
 * Allow an object to alter its behavior when its internal state changes.
 * The object will appear to change its class.
 * 对象状态定义，
 * 封装环境 context 完成状态切换
 * 状态变化 => 行为变化
 */
public abstract class LiftState {
    // 定义环境角色，封装状态变化引起的功能变化
    protected Context context;

    public LiftState() {
    }

    public LiftState(Context context) {
        this.context = context;
    }

    abstract void open();
    abstract void close();
    abstract void run();
    abstract void stop();

    public void setContext(Context context) {
        this.context = context;
    }
}
