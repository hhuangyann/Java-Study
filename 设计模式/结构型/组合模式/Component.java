package 设计模式.结构型.组合模式;

public interface Component {
    public void add(Component component);
    public void remove(Component component);
    public Component getChild(int index);

    void testFunc();
}
