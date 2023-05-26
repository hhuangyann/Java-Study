package 设计模式.创建型.抽象工厂模式;

public abstract class Factory {
    public abstract Phone getPhone();

    public abstract Pad getPad();

    public abstract Router getRouter();
}
