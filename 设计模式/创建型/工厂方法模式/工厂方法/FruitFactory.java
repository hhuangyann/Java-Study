package 设计模式.创建型.工厂方法模式.工厂方法;

import 设计模式.创建型.工厂方法模式.Fruit;

public abstract class FruitFactory<T extends Fruit> {
    public abstract T getFruit();
}
