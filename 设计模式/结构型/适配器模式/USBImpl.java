package 设计模式.结构型.适配器模式;

public class USBImpl implements USB{


    @Override
    public String useUSB() {
        return "正在使用USB接口";
    }
}
