package patterns.adapter.demo3;

public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("get the request");
    }
}
