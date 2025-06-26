package patterns.strategy.demo1;

public class BlockEnemy implements IStrategy{
    @Override
    public void operate() {
        System.out.println("留夫人断后。。。");
    }
}
