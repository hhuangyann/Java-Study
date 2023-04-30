package 设计模式.创建型.单例模式;


/**
 * @author 帅猪
 * 通过volatile+synchronized锁实现了线程安全
 * 通过双重检查的方式实现了懒汉式单例模式
 */
public class Singleton2 {

    private static volatile Singleton2 INSTANCE;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton2.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton2();
                }
            }
        }
        return INSTANCE;
    }

}
