package 设计模式.结构型.代理模式.静态代理;

public class Test {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new TargetImpl());
        proxy.targetFunc();
    }
}
