package 设计模式.创建型.单例模式;


/**
 * @author 帅猪
 * 用枚举的形式实现单例模式
 */

public enum Singleton4 {
    INSTANCE;

    public Singleton4 getInstance(){
        return INSTANCE;
    }

}
