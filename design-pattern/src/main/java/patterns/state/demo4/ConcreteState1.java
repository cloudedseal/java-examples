package patterns.state.demo4;

public class ConcreteState1 extends State{
    @Override
    public void handle1() {

    }

    @Override
    public void handle2() {
        super.context.setCurrentState(Context.STATE2);
        // 过渡到 state1 状态由 context 实现
        super.context.handle2();
    }
}
