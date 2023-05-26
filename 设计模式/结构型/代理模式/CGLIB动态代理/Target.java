package 设计模式.结构型.代理模式.CGLIB动态代理;


//CGLIB要代理的类,不需要实现接口
public class Target {
    public void targetFunc(){
        System.out.println("被代理的方法调用——————");
    }

}
