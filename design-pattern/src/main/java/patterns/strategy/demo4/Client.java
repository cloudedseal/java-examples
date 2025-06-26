package patterns.strategy.demo4;


public class Client {
    public static void main(String[] args) {
        Context context = new Context(new Add());
        System.out.println(context.exec(10, 20, "+"));
    }
}
