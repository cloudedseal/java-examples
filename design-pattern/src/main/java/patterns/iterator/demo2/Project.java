package patterns.iterator.demo2;


import java.util.ArrayList;
import java.util.List;

public class Project implements IProject {
    private String name = "";
    private int num = 0;
    private int cost = 0;
    private List<IProject> projectList = new ArrayList<>();

    public Project() {
    }

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        return String.format("项目名称是: %s,\t 项目人数是: %s,\t 项目费用是:%s", this.name, this.num, this.cost);
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
