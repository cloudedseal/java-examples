package patterns.adapter.demo3;

/**
 * 适配器，中转角色
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        System.out.println("这就是适配器");
        // 委托
         super.doSomething();
    }
}
