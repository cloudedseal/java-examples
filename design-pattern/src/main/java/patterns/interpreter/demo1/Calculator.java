package patterns.interpreter.demo1;

import java.util.HashMap;
import java.util.Stack;

/**
 * Given a language, define a representation for its grammar along with an interpreter
 * that uses the representation to interpret sentences in the language.
 * 文法分析
 */
public class Calculator {
    // 表达式
    private  Expression expression;

    public Calculator(String expStr) {
        Stack<Expression> stack = new Stack<>();
        // 拆分字符数组
        char[] charArray = expStr.toCharArray();
        // 运算
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]){
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    // 公式中的变量
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }
        this.expression = stack.pop();
    }

    public int run(HashMap<String,Integer> var){
        return this.expression.interpreter(var);
    }
}
