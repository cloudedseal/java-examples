package patterns.chainofresponsibility.demo2;

import patterns.chainofresponsibility.demo1.IHandler;
import patterns.chainofresponsibility.demo1.IWomen;

public class Son extends Handler {


    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    public void response(IWomen women) {
        System.out.println("母亲的请求是：" + women.getRequest());
        System.out.println("儿子的回复是：同意");
    }
}
