package patterns.composite.demo5;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private List<Component> componentList = new ArrayList<>();
    @Override
    public void doSomething() {
        System.out.println("树枝节点做事情");
    }

    /**
     * 添加叶子构件 / 树枝构件
     * @param component
     */
    public void add(Component component){
        this.componentList.add(component);
    }

    /**
     * 删除叶子构件 / 树枝构件
     * @param component
     */
    public void remove(Component component){
        this.componentList.remove(component);
    }

    /**
     * 分支下所有叶子构件和树枝构件
     * @return
     */
    public List<Component> getChildren(){
       return this.componentList;
    }


}
