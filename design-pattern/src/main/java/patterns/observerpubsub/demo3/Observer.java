package patterns.observerpubsub.demo3;

/**
 * 观察者
 * Define a one-to-many dependency between objects so that when one object
 * changes state, all its dependants are notified and updated automatically.
 */
public interface Observer {
    void update(String context);
}
