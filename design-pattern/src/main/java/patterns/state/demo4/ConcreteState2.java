package patterns.state.demo4;

public class ConcreteState2 extends State{
    @Override
    public void handle1() {
        super.context.setCurrentState(Context.STATE1);
        // 过渡到 state2 状态由 context 实现
        super.context.handle1();
    }

    @Override
    public void handle2() {

    }
}
