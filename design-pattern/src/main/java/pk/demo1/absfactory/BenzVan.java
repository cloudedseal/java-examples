package pk.demo1.absfactory;

public class BenzVan extends AbsBenz{
    private final static String R_SERIES = "R系商务车";
    @Override
    public String getModel() {
        return R_SERIES;
    }
}
