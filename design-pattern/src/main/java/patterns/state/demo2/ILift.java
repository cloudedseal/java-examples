package patterns.state.demo2;

/**
 * 电梯, 特定状态下的操作
 */
public interface ILift {
    public final static int OPENING_STATE = 1;
    public final static int CLOSING_STATE = 2;
    public final static int RUNNING_STATE = 3;
    public final static int STOPPING_STATE = 4;
    void open();
    void close();
    void run();
    void stop();

    void setState(int state);
}
