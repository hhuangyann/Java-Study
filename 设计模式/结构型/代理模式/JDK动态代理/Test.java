package 设计模式.结构型.代理模式.JDK动态代理;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        Target target = new TargetImpl();
        InvocationHandler handler = new MyInvocationHandler(target);
        Target myProxy = (Target) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler
        );
        myProxy.targetFunc();

    }
}
