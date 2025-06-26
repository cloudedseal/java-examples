package patterns.observerpubsub.demo5;

import patterns.observerpubsub.demo1.IHanFeiZi;
import patterns.observerpubsub.demo1.ILiSi;
import patterns.observerpubsub.demo1.LiSi;

import java.util.Observable;

/**
 * 被观察者
 */
public class HanFeiZi extends Observable implements IHanFeiZi {
    // 聚合的形式
    private ILiSi liSi = new LiSi();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非开始吃饭了。。。");
        super.setChanged();
        super.notifyObservers("韩非开始吃饭了!!!");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非开始娱乐了。。。");
        super.setChanged();
        super.notifyObservers("韩非开始娱乐了!!!");
    }

}

