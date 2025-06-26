package patterns.strategy.demo1;

public class GivenGreenLight implements IStrategy{
    @Override
    public void operate() {
        System.out.println("求国太开绿灯。。。");
    }
}
