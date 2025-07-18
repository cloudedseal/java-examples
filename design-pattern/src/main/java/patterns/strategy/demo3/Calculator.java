package patterns.strategy.demo3;

/**
 * 四则运算，策略不同
 */
public class Calculator {
    private final static String ADD_SYMBOL = "+";
    private final static String SUB_SYMBOL = "-";

    public int exec(int a, int b, String symbol){
        int result = 0;
        if (symbol.equals(ADD_SYMBOL)){
            result = this.add(a, b);
        } else if (symbol.equals(SUB_SYMBOL)){
            result = this.sub(a, b);
        }
        return result;
    }

    private int sub(int a, int b) {
        return a - b;
    }

    private int add(int a, int b) {
        return a + b;
    }
}
