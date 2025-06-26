package pk.demo8.wrapper.proxy;


public class Agent implements IStar {
    // 被代理人
    private IStar star;

    public Agent(IStar star) {
        this.star = star;
    }

    @Override
    public void sign() {
        // 委托
        this.star.sign();
    }
}
