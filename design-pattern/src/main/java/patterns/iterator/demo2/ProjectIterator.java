package patterns.iterator.demo2;

import java.util.ArrayList;
import java.util.List;

public class ProjectIterator implements IProjectIterator{
    private List<IProject> projectList = new ArrayList<>();
    private int currentItem = 0;

    public ProjectIterator(List<IProject> projectList) {
        this.projectList = projectList;
    }

    @Override
    public boolean hasNext() {
        boolean b = true;
        if (this.currentItem >= projectList.size() || this.projectList.get(currentItem) == null){
            b = false;
        }
        return b;
    }

    /**
     * java.util.iterator接口中定义next()方法的返回
     * 值类型是E，而你在ProjectIterator中返回值却是IProject，E和IProject有什么关系？
     * E是JDK 1.5中定义的新类型：元素（Element），是一个泛型符号，表示一个类型，具体
     * 什么类型是在实现或运行时决定，总之它代表的是一种类型，你在这个实现类中把它定义为
     * ProjectIterator，在另外一个实现类可以把它定义为String，都没有问题。它与Object这个类可
     * 是不同的，Object是所有类的父类，随便一个类你都可以把它向上转型到Object类，也只是
     * 因为它是所有类的父类，它才是一个通用类，而E是一个符号，代表所有的类，当然也代表
     * Object了。
     * @return
     */
    @Override
    public IProject next() {
        return this.projectList.get(this.currentItem++);
    }
}
