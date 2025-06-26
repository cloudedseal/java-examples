package principle.isp.demo1;

public abstract class AbstractSearcher {
    protected IPrettyGirl prettyGirl;

    public AbstractSearcher(IPrettyGirl prettyGirl) {
        this.prettyGirl = prettyGirl;
    }

    public abstract void show();
}
