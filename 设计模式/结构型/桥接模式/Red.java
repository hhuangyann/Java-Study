package 设计模式.结构型.桥接模式;

public class Red implements Color{

    @Override
    public void bePaint(String type) {
        System.out.println(type+"是红色的");
    }
}
