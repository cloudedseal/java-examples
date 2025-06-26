package patterns.chainofresponsibility.demo3;

public abstract class Handler {
    private Handler nextHandler;

    // 请求处理逻辑
    public final Response handleMessage(Request request){
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel)){
            response = this.echo(request);
        } else {
            if (this.nextHandler != null){
                response = this.nextHandler.handleMessage(request);
            }
        }
        return response;
    }

    // 设置下一个处理者
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 每个处理者都有一个处理级别
    protected abstract Level getHandlerLevel();
    // 每一个处理者都必须实现处理任务
    protected abstract Response echo(Request request);
}
