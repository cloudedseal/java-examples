package pk.demo1.absfactory;

public abstract class AbsBenz implements ICar{
    private final static String BENZ_BAND = "奔驰汽车";
    @Override
    public String getBand() {
        return BENZ_BAND;
    }

    public abstract String getModel() ;
}
