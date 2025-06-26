package patterns.decorator.demo4;

public class Decorator extends Component{

    // 被装饰者
    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
