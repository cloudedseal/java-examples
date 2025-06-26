package patterns.facade.demo5;

import patterns.facade.demo4.ClassA;
import patterns.facade.demo4.ClassB;
import patterns.facade.demo4.ClassC;

public class Context {
    private ClassA a = new ClassA();
    private ClassC c = new ClassC();

    public void complexMethod(){
        this.a.doSomethingA();
        this.c.doSomethingC();
    }
}
