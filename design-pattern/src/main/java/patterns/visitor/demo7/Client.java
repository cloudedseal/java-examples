package patterns.visitor.demo7;



public class Client {
    public static void main(String[] args) {
        AbsActor actor = new OldActor();

        Role kungFu = new KungFuRole();
//        双分派。双分派意味着得到执行的操作决定于请求的种类和两个接收者的类型，它是多分派的一
//        个特例。从这里也可以看到Java是一个支持双分派的单分派语言。
        kungFu.accept(actor);
    }
}
