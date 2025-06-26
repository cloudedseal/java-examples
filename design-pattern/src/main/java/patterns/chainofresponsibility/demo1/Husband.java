package patterns.chainofresponsibility.demo1;

public class Husband implements IHandler{
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("妻子的请求是：" + women.getRequest());
        System.out.println("丈夫的回复是：同意");
    }
}
