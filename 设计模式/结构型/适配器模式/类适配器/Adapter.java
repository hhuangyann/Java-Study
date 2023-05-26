package 设计模式.结构型.适配器模式.类适配器;

import 设计模式.结构型.适配器模式.TypeCImpl;
import 设计模式.结构型.适配器模式.USB;

public class Adapter extends TypeCImpl implements USB {
    @Override
    public String useUSB() {
        return super.useTypeC();
    }
}
