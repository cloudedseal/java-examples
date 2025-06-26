package patterns.proxydelegate.demo8;


import java.lang.reflect.InvocationHandler;

public class Client {
    public static void main(String[] args) throws Exception {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
       Subject subject = new RealSubject();

        InvocationHandler handler = new MyInvocationHandler(subject);
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        proxy.doSomething("Finished");



        proxy = SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSomething("END");
    }
}
