package patterns.chainofresponsibility.demo1;

public class Father implements IHandler{
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("女儿的请求是：" + women.getRequest());
        System.out.println("父亲的回复是：同意");
    }
}
