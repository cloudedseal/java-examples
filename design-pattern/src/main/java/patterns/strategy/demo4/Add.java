package patterns.strategy.demo4;

public class Add implements Calculator{
    @Override
    public int exec(int a, int b) {
        return a + b;
    }
}
