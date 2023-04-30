package 设计模式.创建型.工厂方法模式.工厂方法;

import 设计模式.创建型.工厂方法模式.Apple;
import 设计模式.创建型.工厂方法模式.Fruit;

public class AppleFactory extends FruitFactory{

    @Override
    public Apple getFruit() {
        return new Apple();
    }
}
