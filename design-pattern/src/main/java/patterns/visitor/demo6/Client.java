package patterns.visitor.demo6;

public class Client {
    public static void main(String[] args) {
        AbsActor actor = new OldActor();

        Role kungFu = new KungFuRole();
        // 编译期决定
        actor.act(kungFu);
        // 运行时决定
        actor.act(new KungFuRole());
    }
}
