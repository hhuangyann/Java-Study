package 设计模式.结构型.适配器模式.接口适配器;

import 设计模式.结构型.适配器模式.TypeC;
import 设计模式.结构型.适配器模式.TypeCImpl;
import 设计模式.结构型.适配器模式.USB;

public abstract class Adapter implements USB {
    TypeC typeC = new TypeCImpl();

    @Override
    public String useUSB(){
        return typeC.useTypeC();
    }

    //通过抽象类中的空方法，为子类屏蔽掉不需要的抽象方法。

}
