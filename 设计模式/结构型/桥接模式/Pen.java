package 设计模式.结构型.桥接模式;

public abstract class Pen {
    Color color;

    public void setColor(Color color){
        this.color = color;
    }

    public abstract void draw();

}
