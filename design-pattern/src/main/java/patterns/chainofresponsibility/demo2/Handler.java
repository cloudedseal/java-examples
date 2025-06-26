package patterns.chainofresponsibility.demo2;

import patterns.chainofresponsibility.demo1.IWomen;

/**
 * Avoid couping the sender of a request to its receiver by giving more than one object a chance to
 * handle the request. Chain the receiving objects and pass the request along the chain until an object
 * handles it.
 *
 */
public abstract class Handler {

    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    // 能处理的级别
    private int level = 0;
    // 下一个责任人
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    // 模版方法，不允许重写
    public final void handleMessage(IWomen women){
        if (women.getType() == this.level){
            this.response(women);
        } else {
            if (this.nextHandler != null){
                this.nextHandler.handleMessage(women);
            } else {
                System.out.println("后续无人处理，不同意了");
            }
        }
    }


    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract void response(IWomen women);

}
