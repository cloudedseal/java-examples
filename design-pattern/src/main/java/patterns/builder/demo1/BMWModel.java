package patterns.builder.demo1;


public class BMWModel extends CarModel {
    @Override
    public void start() {
        System.out.println("宝马发动。。。");
    }

    @Override
    public void stop() {
        System.out.println("宝马停车。。。");
    }

    @Override
    public void alarm() {
        System.out.println("宝马鸣笛。。。");
    }

    @Override
    public void engineBoom() {
        System.out.println("宝马引擎声音是这样的。。。");
    }
    
}
