package patterns.strategy.demo3;

public class Client {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.exec(10, 30, "+"));
    }
}
