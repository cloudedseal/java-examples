package pk.demo1.builder;

public class ChildSuperManBuilder extends Builder{
    @Override
    public SuperMan getSuperMan() {
        super.setBody("弱小的躯体");
        super.setSpecialTalent("快速移动");
        super.setSpecialSymbol("胸前带小S标记");
        return super.superMan;
    }
}
