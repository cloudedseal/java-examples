package patterns.composite.demo4;

public class Leaf extends Component{
    @Override
    public void doSomething() {
        System.out.println("叶子节点做事情");
    }
}
