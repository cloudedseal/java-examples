package patterns.abstractfactory.demo1;

public class MaleBlackHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
        System.out.println("黑人男性");
    }
}
