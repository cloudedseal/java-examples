package pk.demo1.absfactory;

public class BMWSuv extends AbsBMW{
    private final static String X_SERIES = "x系车型SUV";
    @Override
    public String getModel() {
        return X_SERIES;
    }
}
