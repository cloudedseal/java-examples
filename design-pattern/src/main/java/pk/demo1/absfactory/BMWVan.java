package pk.demo1.absfactory;

public class BMWVan extends AbsBMW{
    private final static String SEVENT_SERIES = "7系车型商务车";
    @Override
    public String getModel() {
        return SEVENT_SERIES;
    }
}
