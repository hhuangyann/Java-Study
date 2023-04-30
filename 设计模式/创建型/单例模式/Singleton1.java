package 设计模式.创建型.单例模式;

/**
 * @author 帅猪
 * 最简单的单例模式（饿汉式）使用静态变量INSTANCE
 * 在类加载时就初始化INSTANCE
 * 后续getInstance直接返回该对象即可
 * 没有实现懒加载
 */

public class Singleton1 {
    private Singleton1(){
    }

    private static final Singleton1 INSTANCE = new Singleton1();

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}
