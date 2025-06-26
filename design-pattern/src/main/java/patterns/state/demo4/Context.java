package patterns.state.demo4;

/**
 * 状态定义为 static
 * 有 State 所有行为，直接委托
 */
public class Context {
    public final static State STATE1 = new ConcreteState1();
    public final static State STATE2 = new ConcreteState2();

    private State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        // 切换状态
        this.currentState.setContext(this);
    }


    public void handle1() {
        // 委托
        this.currentState.handle1();
    }

    public void handle2() {
        this.currentState.handle2();
    }
}
