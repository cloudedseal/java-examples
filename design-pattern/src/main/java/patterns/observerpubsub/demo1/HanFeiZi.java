package patterns.observerpubsub.demo1;

/**
 * 被观察者
 */
public class HanFeiZi implements IHanFeiZi{
    private boolean isHavingBreakfast = false;
    private boolean isHavingFun = false;
    @Override
    public void haveBreakfast() {
        System.out.println("韩非开始吃饭了。。。");
        this.isHavingBreakfast = true;
    }

    @Override
    public void haveFun() {
        System.out.println("韩非开始娱乐了。。。");
        this.isHavingFun = true;
    }

    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }
}
