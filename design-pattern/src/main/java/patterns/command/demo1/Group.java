package patterns.command.demo1;

public abstract class Group {
    // 找到这个组
    public abstract void find();
    // 添加功能
    public abstract void add();
    // 删除功能
    public abstract void delete();

    // 修改功能
    public abstract void change();

    // 变更计划
    public abstract void plan();

}
