package 设计模式.结构型.桥接模式;

public class Blue implements Color{

    @Override
    public void bePaint(String type) {
        System.out.println(type+"是蓝色的");
    }
}
