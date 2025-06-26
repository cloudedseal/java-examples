package patterns.factory.demo1;

/**
 * 对扩展开放，新增的人种，无需修改工厂类
 */
public class BrownHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("棕色人种皮肤颜色是棕色的");
    }

    @Override
    public void talk() {
        System.out.println("棕人会说话，一般说单音节字。");
    }
}
