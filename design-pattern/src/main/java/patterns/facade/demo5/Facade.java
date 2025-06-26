package patterns.facade.demo5;

import patterns.facade.demo4.ClassA;
import patterns.facade.demo4.ClassB;
import patterns.facade.demo4.ClassC;

public class Facade {
    // 被委托的对象
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    // 提供给外部访问的方法
    public void methodA(){
        this.a.doSomethingA();
    }

    // 提供给外部访问的方法
    public void methodB(){
        this.b.doSomethingB();
    }


    public void methodC(){
//        参与了业务逻辑
        this.a.doSomethingA();
        this.c.doSomethingC();
    }
}
