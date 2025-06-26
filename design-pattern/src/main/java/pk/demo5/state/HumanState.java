package pk.demo5.state;

public abstract class HumanState {
    // 指向具体的人
    protected Human human;

    public void setHuman(Human human) {
        this.human = human;
    }

    public abstract void work();
}
