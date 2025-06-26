package patterns.bridge.demo1;

public abstract class Corp {
    protected abstract void produce();

    protected abstract void sell();

    public void makeMoney(){
        this.produce();
        this.sell();
    }
}
