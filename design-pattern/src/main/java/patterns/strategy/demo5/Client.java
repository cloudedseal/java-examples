package patterns.strategy.demo5;


public class Client {
    public static void main(String[] args) {
        System.out.println(Calculator.ADD.exec(10, 20));
    }
}
