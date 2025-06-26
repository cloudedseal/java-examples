package patterns.flyweight.demo3;

public class ConcreteFlyweight2 extends Flyweight{
    /**
     * 享元角色必须接受外部状态
     *
     * @param extrinsic
     */
    public ConcreteFlyweight2(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {

    }
}
