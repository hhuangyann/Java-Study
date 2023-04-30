package 设计模式.创建型.工厂方法模式.工厂方法;

import 设计模式.创建型.工厂方法模式.Fruit;
import 设计模式.创建型.工厂方法模式.Orange;

public class OrangeFactory extends FruitFactory{

    @Override
    public Orange getFruit() {
        return new Orange();
    }
}
