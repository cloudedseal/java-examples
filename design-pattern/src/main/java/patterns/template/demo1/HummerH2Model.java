package patterns.template.demo1;

public class HummerH2Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马H2发动。。。");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2停车。。。");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛。。。");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的。。。");
    }

    @Override
    public void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
