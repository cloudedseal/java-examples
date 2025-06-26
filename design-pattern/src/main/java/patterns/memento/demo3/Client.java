package patterns.memento.demo3;


import patterns.memento.demo2.Boy;
import patterns.memento.demo2.Memento;

public class Client {
    public static void main(String[] args) {
        // 备忘录管理
        Caretaker caretaker = new Caretaker();
        Boy boy = new Boy();
        boy.setState("心情很好!");
        System.out.println("---现在状态---");
        System.out.println(boy.getState());
        // 保存现在的状态,
        Memento memento = boy.createMemento();
        caretaker.setMemento(memento);
        boy.changeState();
        System.out.println("---改变之后的状态---");
        System.out.println(boy.getState());

        System.out.println("---原来的状态---");
        boy.restoreMemento(caretaker.getMemento());
        System.out.println(boy.getState());
    }
}
