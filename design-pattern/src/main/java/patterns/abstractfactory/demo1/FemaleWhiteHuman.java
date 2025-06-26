package patterns.abstractfactory.demo1;

public class FemaleWhiteHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
        System.out.println("白人女性");
    }
}
