package pk.demo3.decorator;

public class BeautifyAppearance extends Decorator{
    public BeautifyAppearance(Swan swan) {
        super(swan);
    }

    @Override
    public void desAppearance() {
        System.out.println("外表是纯白色的，非常惹人喜爱");
    }
}
