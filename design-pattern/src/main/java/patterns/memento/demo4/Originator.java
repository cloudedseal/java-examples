package patterns.memento.demo4;


/**
 * 发起人角色
 */
public class Originator {
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 创建一个备份保存旧状态
    public Memento createMemento(){
        return new Memento(this.state);
    }

    // 恢复旧状态
    public void restoreMemento(Memento memento){
        this.state = memento.getState();
    }
}
