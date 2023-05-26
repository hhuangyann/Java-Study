package 设计模式.结构型.桥接模式;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Pen testPen = new BigPen();
        testPen.setColor(new Blue());
        testPen.draw();
    }
}
