package pk.demo8.wrapper.proxy;

public class Idolater {
    public static void main(String[] args) {
        IStar star = new Singer();
        IStar agent = new Agent(star);
        agent.sign();
    }
}
