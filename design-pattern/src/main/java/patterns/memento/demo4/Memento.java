package patterns.memento.demo4;

/**
 * Without violating encapsulation, capture and externalize an object's internal state
 * so that the object can be restored to this state later.
 */
public class Memento {
    // 状态
    private String state = "";

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
