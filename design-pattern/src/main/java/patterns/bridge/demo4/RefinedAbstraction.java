package patterns.bridge.demo4;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor imp) {
        super(imp);
    }

    // 修正父类行为
    @Override
    public void request() {
        super.request();
        // 委托
        super.getImp().doAnything();
    }
}
