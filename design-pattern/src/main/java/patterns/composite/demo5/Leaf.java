package patterns.composite.demo5;


import java.util.List;

public class Leaf extends Component {
    @Override
    public void doSomething() {
        System.out.println("叶子节点做事情");
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Component> getChildren() {
        throw new UnsupportedOperationException();
    }
}
