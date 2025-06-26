package principle.lkp.demo2;


import principle.lkp.demo1.Girl;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        List listGirls = new ArrayList();
        for (int i = 0; i < 20; i++) {
            listGirls.add(new Girl());
        }
        teacher.command(new GroupLeader(listGirls));
    }
}
