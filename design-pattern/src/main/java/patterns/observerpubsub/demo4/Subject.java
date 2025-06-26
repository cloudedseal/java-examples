package patterns.observerpubsub.demo4;

import java.util.Vector;

/**
 * 被观察者
 */
public abstract class Subject {
    private Vector<Observer> observerVector = new Vector<Observer>();

    /**
     * 添加观察者
     * @param o
     */
    public void addObserver(Observer o){
        this.observerVector.add(o);
    }

    /**
     * 删除观察者
     * @param o
     */
    public void deleteObserver(Observer o){
        this.observerVector.remove(o);
    }

    /**
     * 通知所有观察者
     */
    public void notifyObservers(){
        for (Observer observer : this.observerVector) {
            observer.update();
        }
    }
}
