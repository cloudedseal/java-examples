package patterns.proxydelegate.demo7dyn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {
    // 被代理类
    Class cls = null;
    // 被代理的实例
    Object obj = null;

    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在被代理类上调用方法
        Object result = method.invoke(this.obj, args);
        if (method.getName().equalsIgnoreCase("login")){
            System.out.println("有人登录我的账号，是否被盗了");
        }
        return result;
    }
}
