package patterns.strategy.demo4;

public class Context {
    private Calculator cal;

    public Context(Calculator cal) {
        this.cal = cal;
    }

    public int exec(int a, int b, String symbol){
        return this.cal.exec(a, b);
    }
}
