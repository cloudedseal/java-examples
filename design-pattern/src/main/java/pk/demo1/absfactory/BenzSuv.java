package pk.demo1.absfactory;

public class BenzSuv extends AbsBenz{
    private final static String G_SERIES = "G系车型SUV";
    @Override
    public String getModel() {
        return G_SERIES;
    }
}
