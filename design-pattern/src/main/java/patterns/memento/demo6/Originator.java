package patterns.memento.demo6;



/**
 * 发起人角色
 */
public class Originator implements Cloneable{
    private Originator backup;
    
    // 内部状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 创建一个备份保存旧状态
    public void createMemento() {
        try {
            this.backup = this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    // 恢复旧状态
    public void restoreMemento(){
        this.state = this.backup.getState();
    }

    @Override
    protected Originator clone() throws CloneNotSupportedException {
        return (Originator) super.clone();
    }
}
