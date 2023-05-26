package 设计模式.结构型.组合模式;

public class File implements Component{

    String content;
    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int index) {
        return null;
    }


    @Override
    public void testFunc() {
        System.out.println("组合模式测试方法成功! "+this);
    }
}
