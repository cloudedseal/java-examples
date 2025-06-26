package patterns.abstractfactory.demo1;

public class MaleYellowHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}
