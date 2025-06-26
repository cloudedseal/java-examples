package patterns.bridge.demo4;

/**
 * 抽象化角色
 */
public class Abstraction {
    private Implementor imp;

    public Abstraction(Implementor imp) {
        this.imp = imp;
    }

    // 自身属性和行为
    public void request(){
        this.imp.doSomething();
    }

    public Implementor getImp(){
        return this.imp;
    }
}
