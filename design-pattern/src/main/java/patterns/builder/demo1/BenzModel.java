package patterns.builder.demo1;


public class BenzModel extends CarModel {
    @Override
    public void start() {
        System.out.println("奔驰发动。。。");
    }

    @Override
    public void stop() {
        System.out.println("奔驰停车。。。");
    }

    @Override
    public void alarm() {
        System.out.println("奔驰鸣笛。。。");
    }

    @Override
    public void engineBoom() {
        System.out.println("奔驰引擎声音是这样的。。。");
    }

}
