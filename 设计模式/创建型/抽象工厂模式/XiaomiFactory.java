package 设计模式.创建型.抽象工厂模式;

public class XiaomiFactory extends Factory{
    @Override
    public Phone getPhone() {
        return new XiaomiPhone();
    }

    @Override
    public Pad getPad() {
        return new XiaomiPad();
    }

    @Override
    public Router getRouter() {
        return new XiaomiRouter();
    }
}
