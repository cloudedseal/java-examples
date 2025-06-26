package patterns.state.demo3;

public class OpeningState extends LiftState{
    public OpeningState() {
    }

    public OpeningState(Context context) {
        super(context);
    }

    @Override
    void open() {
        System.out.println("电梯门开启。。。");
    }

    @Override
    void close() {
       super.context.setLiftState(Context.closingState);
       // 委托
        super.context.getLiftState().close();
    }

    @Override
    void run() {
        System.out.println("电梯们开着，什么也不做。。。");
    }

    @Override
    void stop() {

    }
}
