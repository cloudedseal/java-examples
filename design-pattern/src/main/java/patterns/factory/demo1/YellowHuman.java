package patterns.factory.demo1;

public class YellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黄色人种皮肤颜色是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄人会说话，一般说双音节字。");
    }
}
