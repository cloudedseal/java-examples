package patterns.flyweight.demo3;

public abstract class Flyweight {
    // 内部状态
    private String intrinsic;
    // 外部状态
    private final String extrinsic;

    /**
     * 享元角色必须接受外部状态
     * @param extrinsic
     */
    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
