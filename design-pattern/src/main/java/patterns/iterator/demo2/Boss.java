package patterns.iterator.demo2;



import java.util.ArrayList;
import java.util.List;

public class Boss {
    public static void main(String[] args) {
        IProject project = new Project();
        List<IProject> projectList = new ArrayList<>();
        project.add("星球大战项目", 10, 10000000);
        project.add("地球大战项目", 100, 1000000000);
        project.add("宇宙大战项目", 1000, 1000000000);

        //这边100个项目
        for (int i = 4; i < 104; i++) {
            project.add("第" + i + "个项目", i * 5, i * 1000);
        }

        IProjectIterator iterator = project.iterator();
        while (iterator.hasNext()){
            IProject p = (IProject) iterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
