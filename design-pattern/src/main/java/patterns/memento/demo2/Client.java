package patterns.memento.demo2;


public class Client {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setState("心情很好!");
        System.out.println("---现在状态---");
        System.out.println(boy.getState());
        // 保存现在的状态,
        Memento memento = boy.createMemento();

        boy.changeState();
        System.out.println("---改变之后的状态---");
        System.out.println(boy.getState());

        System.out.println("---原来的状态---");
        boy.restoreMemento(memento);
        System.out.println(boy.getState());
    }
}
