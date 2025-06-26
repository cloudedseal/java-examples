package patterns.composite.demo1;

import java.util.ArrayList;

public interface IRoot {
    // 总经理信息
    String getInfo();
    void add(IBranch branch);
    // 添加小兵
    void add(ILeaf leaf);
    // 遍历
    ArrayList getSubordinateInfo();

}
