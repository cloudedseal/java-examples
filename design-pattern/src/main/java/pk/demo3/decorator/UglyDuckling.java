package pk.demo3.decorator;

public class UglyDuckling implements Swan{
    @Override
    public void fly() {
        System.out.println("丑小鸭不能飞行");
    }

    @Override
    public void cry() {
        System.out.println("丑小鸭叫声是克噜");
    }

    @Override
    public void desAppearance() {
        System.out.println("外形是脏兮兮的白色，毛茸茸的大脑袋");
    }
}
