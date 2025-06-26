package patterns.memento.demo1;

public class Client {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setState("心情很好!");
        System.out.println("---现在状态---");
        System.out.println(boy.getState());
        // 保存现在的状态, 不应该高层模块来负责
        Boy backup = new Boy();
        backup.setState(boy.getState());

        boy.changeState();
        System.out.println("---改变之后的状态---");
        System.out.println(boy.getState());

        System.out.println("---原来的状态---");
        boy.setState(backup.getState());
        System.out.println(boy.getState());
    }
}
