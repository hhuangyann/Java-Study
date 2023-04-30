package 设计模式.创建型.工厂方法模式.简单工厂;

import 设计模式.创建型.工厂方法模式.Apple;
import 设计模式.创建型.工厂方法模式.Fruit;
import 设计模式.创建型.工厂方法模式.Orange;

public class FruitFactory {

    static Fruit getFruit(String fruitType){
        switch (fruitType){
            case "Apple":
                return new Apple();
            case "Orange":
                return new Orange();
            default:
                return null;
        }
    }
}
