package principle.lkp.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 *  Law of Demeter
 *  least knowledge principle
 */
public class Teacher {
    // 朋友类
    // 成员变量，方法输入输出参数成员
    public void command(GroupLeader groupLeader){
        List listGirls = new ArrayList();
        for (int i = 0; i < 20; i++) {
            // 内部的 Girl 不是 Teacher 的朋友类
            listGirls.add(new Girl());
        }
        groupLeader.countGirls(listGirls);
    }
}
