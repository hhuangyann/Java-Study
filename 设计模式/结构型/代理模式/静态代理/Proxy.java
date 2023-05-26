package 设计模式.结构型.代理模式.静态代理;

import 设计模式.结构型.桥接模式.Pen;

public class Proxy implements Target {

    private final Target target;

    public Proxy(Target target) {
        this.target = target;
    }

    @Override
    public void targetFunc() {
        System.out.println("执行被代理的方法之前---");
        target.targetFunc();
        System.out.println("执行被代理的方法之后---");
    }
}
