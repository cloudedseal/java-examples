package patterns.adapter.demo3;

public class Client {
    public static void main(String[] args) {
        // 原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        System.out.println("------");
        // 适配器之后的业务逻辑
        target = new Adapter();
        target.request();

    }


}
