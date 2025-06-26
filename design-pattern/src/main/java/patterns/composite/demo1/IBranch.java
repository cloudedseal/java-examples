package patterns.composite.demo1;

import java.util.ArrayList;

public interface IBranch {
    String getInfo();
    void add(IBranch branch);
    void add(ILeaf leaf);
    ArrayList getSubordinateInfo();
}
