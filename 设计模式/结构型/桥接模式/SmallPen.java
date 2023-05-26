package 设计模式.结构型.桥接模式;

public class SmallPen extends Pen{
    @Override
    public void draw() {
        color.bePaint("小笔");
    }
}
