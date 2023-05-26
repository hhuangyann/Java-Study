package 设计模式.结构型.组合模式;

public class Test {
    public static void main(String[] args) {
        Directory directory1 = new Directory();
        directory1.add(new Directory());
        directory1.add(new File());
        directory1.add(new File());
        directory1.getChild(0).add(new File());
        directory1.testFunc();
    }
}
