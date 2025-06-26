package patterns.abstractfactory.demo1;

public class FemaleBlackHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
        System.out.println("黑人女性");
    }
}
