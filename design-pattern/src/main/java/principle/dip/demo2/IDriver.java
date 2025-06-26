package principle.dip.demo2;

public interface IDriver {

    /**
     * 依赖的是 ICar 这个接口，这个接口就是来隔离变化的
     * @param car
     */
    void drive(ICar car);
}
