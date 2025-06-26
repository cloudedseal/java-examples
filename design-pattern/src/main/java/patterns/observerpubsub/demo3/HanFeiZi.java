package patterns.observerpubsub.demo3;

import patterns.observerpubsub.demo1.IHanFeiZi;

import java.util.ArrayList;
import java.util.List;

public class HanFeiZi implements Observable, IHanFeiZi {
    // 所有观察者
    private List<Observer> observerList = new ArrayList<>();
    @Override
    public void haveBreakfast() {
        System.out.println("韩非开始吃饭了。。。");
        this.notifyObservers("韩非开始吃饭了!!!");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非开始娱乐了。。。");
        this.notifyObservers("韩非开始娱乐了!!!");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : this.observerList) {
            // 委托
            observer.update(context);
        }
    }
}
