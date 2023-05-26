package 设计模式.结构型.适配器模式.对象适配器模式;

import 设计模式.结构型.适配器模式.TypeC;
import 设计模式.结构型.适配器模式.TypeCImpl;
import 设计模式.结构型.适配器模式.USB;
import 设计模式.结构型.适配器模式.USBImpl;

public class Adapter implements USB {

    TypeC typeC = new TypeCImpl();

    @Override
    public String useUSB() {
        return typeC.useTypeC();
    }
}
