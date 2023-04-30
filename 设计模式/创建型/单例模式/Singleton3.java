package 设计模式.创建型.单例模式;


/**
 * @author 帅猪
 * 用内部类实现懒汉式单例模式
 */


public class Singleton3 {
    private Singleton3(){

    }
    static class Holder{
        private final static Singleton3 INSTANCE = new Singleton3();
    }

    public Singleton3 getInstance(){
        return Holder.INSTANCE;
    }

}
