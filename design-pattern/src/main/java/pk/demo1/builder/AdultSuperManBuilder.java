package pk.demo1.builder;

public class AdultSuperManBuilder extends Builder{


    @Override
    public SuperMan getSuperMan() {
        super.setBody("强壮的躯体");
        super.setSpecialTalent("飞行");
        super.setSpecialSymbol("胸前带S标记");
        return super.superMan;
    }
}
