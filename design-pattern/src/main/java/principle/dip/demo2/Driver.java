package principle.dip.demo2;

/**
 * 依赖倒置
 * 通过抽象（接口/抽象类）类之间或者模块之间彼此独立，不互相影响，松耦合
 */
public class Driver implements IDriver{
    /*
       Driver 依赖的是抽象的 ICar 接口，不是具体的 ICar 实现类。
       在接口不变的前提下，无论 ICar 的实现类如何变化，对 Driver 类没有影响
     */
    private ICar car;

    public Driver() {
    }

    // 方法1 构造注入
    public Driver(ICar car) {
        this.car = car;
    }

    // 方法2 setter 注入
    public void setCar(ICar car) {
        this.car = car;
    }

    // 方法3 接口注入
    @Override
    public void drive(ICar car) {
        car.run();
    }
}
