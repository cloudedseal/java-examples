package patterns.state.demo1;

/**
 * 电梯, 特定状态下的操作
 */
public interface ILift {
    void open();
    void close();
    void run();
    void stop();
}
