package patterns.adapter.demo3;

/**
 * 不兼容 Target 的类
 */
public class Adaptee {
    // 原有业务逻辑
    public void doSomething(){
        System.out.println("work hard");
    }
}
