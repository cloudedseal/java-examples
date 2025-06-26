package patterns.observerpubsub.demo3;

/**
 * 可观察的，被观察者
 */
public interface Observable {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers(String context);
}
