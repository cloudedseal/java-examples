package patterns.chainofresponsibility.demo3;

public class Client {
    public static void main(String[] args) {
        // 所有处理节点
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler1();
        Handler handler3 = new ConcreteHandler1();

        // 1 -> 2 -> 3
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        Response response = handler1.handleMessage(new Request());
    }
}
