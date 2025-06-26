package patterns.flyweight.demo3;

public class ConcreteFlyweight1 extends Flyweight{
    /**
     * 享元角色必须接受外部状态
     *
     * @param extrinsic
     */
    public ConcreteFlyweight1(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {

    }
}
