package pk.demo1.absfactory;

public abstract class AbsBMW implements ICar{
    private final static String BMW_BAND = "宝马汽车";
    @Override
    public String getBand() {
        return BMW_BAND;
    }

    public abstract String getModel() ;
}
