package pk.demo3.decorator;

public class WhiteSwan implements Swan{
    @Override
    public void fly() {
        System.out.println("能够飞行");
    }

    @Override
    public void cry() {
        System.out.println("叫声是咕噜咕噜？？？");
    }

    @Override
    public void desAppearance() {
        System.out.println("外形纯白色，漂亮");
    }
}
