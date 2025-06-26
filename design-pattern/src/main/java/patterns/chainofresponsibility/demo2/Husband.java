package patterns.chainofresponsibility.demo2;

import patterns.chainofresponsibility.demo1.IHandler;
import patterns.chainofresponsibility.demo1.IWomen;

public class Husband extends Handler {

    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    public void response(IWomen women) {
        System.out.println("妻子的请求是：" + women.getRequest());
        System.out.println("丈夫的回复是：同意");
    }
}
