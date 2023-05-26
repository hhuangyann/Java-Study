package 设计模式.结构型.代理模式.JDK动态代理;

public class TargetImpl implements Target{
    @Override
    public void targetFunc() {
        System.out.println("这是被代理的方法");
    }
}
