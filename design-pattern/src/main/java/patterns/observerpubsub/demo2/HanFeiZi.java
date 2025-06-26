package patterns.observerpubsub.demo2;

import patterns.observerpubsub.demo1.IHanFeiZi;
import patterns.observerpubsub.demo1.ILiSi;
import patterns.observerpubsub.demo1.LiSi;

/**
 * 被观察者
 */
public class HanFeiZi implements IHanFeiZi {
    // 聚合的形式
    private ILiSi liSi = new LiSi();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非开始吃饭了。。。");
        this.liSi.update("韩非开始吃饭了!!!");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非开始娱乐了。。。");
        this.liSi.update("韩非开始娱乐了!!!");
    }

}
