package patterns.memento.demo2;

public class Boy {
    private String state = "";
    public void changeState(){
        this.state = "心情可能很不好";
    }

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
