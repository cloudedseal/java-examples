package pk.demo5.strategy;

public class Context {
    private WorkAlgorithm work;

    public Context() {
    }


    public WorkAlgorithm getWork() {
        return work;
    }

    public void setWork(WorkAlgorithm work) {
        this.work = work;
    }

    public void work(){
        // 委托
        this.work.work();
    }
}
