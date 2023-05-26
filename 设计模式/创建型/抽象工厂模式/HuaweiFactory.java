package 设计模式.创建型.抽象工厂模式;

public class HuaweiFactory extends Factory{

    @Override
    public Phone getPhone() {
        return new HuaweiPhone();
    }

    @Override
    public Pad getPad() {
        return new HuaweiPad();
    }

    @Override
    public Router getRouter() {
        return new HuaweiRouter();
    }
}
