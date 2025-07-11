package patterns.proxydelegate.demo8;

public class SubjectDynamicProxy extends DynamicProxy{
       public static <T> T newProxyInstance(Subject subject){
           return newProxyInstance(subject.getClass().getClassLoader(),
                   subject.getClass().getInterfaces(),
                   new MyInvocationHandler(subject));
       }
}
