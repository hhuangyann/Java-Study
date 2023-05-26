package 设计模式.结构型.代理模式.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private final Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("这是被代理的方法前");
        method.invoke(target,args);
        System.out.println("这是被代理的方法后");
        return null;
    }
}
