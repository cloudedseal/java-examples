package patterns.iterator.demo1;

import java.util.ArrayList;
import java.util.List;

public class Boss {
    public static void main(String[] args) {
        List<IProject> projectList = new ArrayList<>();
        projectList.add(new Project("星球大战项目", 10, 10000000));
        projectList.add(new Project("地球大战项目", 100, 1000000000));
        projectList.add(new Project("宇宙大战项目", 1000, 1000000000));

        //这边100个项目
        for (int i = 4; i < 104; i++) {
            projectList.add(new Project("第" + i + "个项目", i * 5, i * 1000));
        }

        for (IProject project : projectList) {
            System.out.println(project.getProjectInfo());
        }
    }
}
