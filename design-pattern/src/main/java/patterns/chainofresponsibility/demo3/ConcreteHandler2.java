package patterns.chainofresponsibility.demo3;

public class ConcreteHandler2 extends Handler{
    @Override
    protected Level getHandlerLevel() {
        return null;
    }

    @Override
    protected Response echo(Request request) {
        return null;
    }
}
