package patterns.interpreter.demo1;

import java.util.HashMap;

/**
 * 变量解析, 终结符表达式
 */
public class VarExpression extends Expression{
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
