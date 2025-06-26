package patterns.chainofresponsibility.demo1;

public class Son implements IHandler{
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("母亲的请求是：" + women.getRequest());
        System.out.println("儿子的回复是：同意");
    }
}
