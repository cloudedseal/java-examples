package patterns.facade.demo5;

import patterns.facade.demo4.ClassA;
import patterns.facade.demo4.ClassB;
import patterns.facade.demo4.ClassC;

public class Facade2 {
    // 被委托的对象
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    // 中间层来隔离变化
    private Context context = new Context();

    // 提供给外部访问的方法
    public void methodA(){
        this.a.doSomethingA();
    }

    // 提供给外部访问的方法
    public void methodB(){
        this.b.doSomethingB();
    }


    public void methodC(){
//        在构建新的业务逻辑
      this.context.complexMethod();
    }
}
