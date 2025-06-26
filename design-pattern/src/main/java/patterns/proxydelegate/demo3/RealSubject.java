package patterns.proxydelegate.demo3;

public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("real subject request");
    }
}
