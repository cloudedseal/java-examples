package patterns.composite.demo5;


import java.util.List;

/**
 * 透明模式
 */
public abstract class Component {
    public void doSomething(){

    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract List<Component> getChildren();

}
