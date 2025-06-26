package principle.dip.demo2;

/**
 * 增加一个，需要修改 Driver 类
 */
public class BMW implements ICar{
    @Override
    public void run(){
        System.out.println("宝马汽车开始运行。。。");
        System.out.println("BMW 变化影响不到 Driver");
    }
}
