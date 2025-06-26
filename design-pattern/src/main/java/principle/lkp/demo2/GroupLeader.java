package principle.lkp.demo2;

import principle.lkp.demo1.Girl;

import java.util.List;

public class GroupLeader {

    private List<Girl> listGirls;

    public GroupLeader(List<Girl> listGirls) {
        this.listGirls = listGirls;
    }

    public void countGirls() {
        System.out.println("girls number:" + listGirls.size());
    }
}
