package 设计模式.结构型.组合模式;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Component{

    List<Component> children = new ArrayList<>();
    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return children.get(index);
    }

    @Override
    public void testFunc() {
        children.forEach(Component::testFunc);
    }
}
