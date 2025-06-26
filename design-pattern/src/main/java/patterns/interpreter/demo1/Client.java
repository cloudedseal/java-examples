package patterns.interpreter.demo1;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        String exp = "a+b";
        Calculator calculator = new Calculator(exp);
        HashMap<String, Integer> values = new HashMap<>();
        values.put("a",10);
        values.put("b",20);
        System.out.println(calculator.run(values));

    }
}
