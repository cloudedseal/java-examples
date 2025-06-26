package patterns.strategy.demo1;

public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        System.out.println("刚到吴国");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("------");
        System.out.println("乐不思蜀");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("------");
        System.out.println("追兵来了");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
