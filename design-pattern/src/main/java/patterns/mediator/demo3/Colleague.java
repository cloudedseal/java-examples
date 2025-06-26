package patterns.mediator.demo3;


/**
 * 每一个都持有中介者
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
