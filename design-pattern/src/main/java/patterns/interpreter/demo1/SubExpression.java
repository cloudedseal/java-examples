package patterns.interpreter.demo1;

import java.util.HashMap;

/**
 * 非终结符表达式
 */
public class SubExpression extends SymbolExpression{
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return this.left.interpreter(var) - super.right.interpreter(var);
    }
}
