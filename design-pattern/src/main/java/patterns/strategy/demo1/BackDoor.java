package patterns.strategy.demo1;

public class BackDoor implements IStrategy{
    @Override
    public void operate() {
        System.out.println("找国老帮忙。。。");
    }
}
