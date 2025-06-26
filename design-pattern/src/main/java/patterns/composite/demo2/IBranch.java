package patterns.composite.demo2;


import java.util.ArrayList;

public interface IBranch extends ICorp{
    void add(IBranch branch);
    void add(ILeaf leaf);
    ArrayList<ICorp> getSubordinateInfo();
}
