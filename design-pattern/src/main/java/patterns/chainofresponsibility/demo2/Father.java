package patterns.chainofresponsibility.demo2;

import patterns.chainofresponsibility.demo1.IWomen;

public class Father extends Handler {

    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("女儿的请求是：" + women.getRequest());
        System.out.println("父亲的回复是：同意");
    }
}
