package patterns.facade.demo4;

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

    // 提供给外部访问的方法
    public void methodC(){
        this.c.doSomethingC();
    }
}
