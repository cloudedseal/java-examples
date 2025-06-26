package patterns.composite.demo2;



import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        IBranch ceo = compositeCorpTree();

        System.out.println(ceo.getInfo());
        getAllSubordinateInfo(ceo.getSubordinateInfo());
    }

    private static IBranch compositeCorpTree() {
        // 创建一个 root
        IBranch ceo = new Branch("尔朱荣","CEO",100000);
        IBranch developDep = new Branch("高欢","Shogun1",2000);
        IBranch saleDep = new Branch("宇文泰","Shogun2",4000);
        IBranch financeDep = new Branch("独孤信","Shogun3",6000);

        Leaf leaf1 = new Leaf("小兵1","步兵",100);
        Leaf leaf2 = new Leaf("小兵2","步兵",140);
        Leaf leaf3 = new Leaf("小兵3","步兵",130);

        ceo.add(developDep);
        ceo.add(saleDep);
        ceo.add(financeDep);

        developDep.add(leaf1);
        saleDep.add(leaf2);
        financeDep.add(leaf3);
        return ceo;
    }

    private static void getAllSubordinateInfo(ArrayList subordinateList) {
        int size = subordinateList.size();
        for (int i = 0; i < size; i++) {
            Object s = subordinateList.get(i);
            if (s instanceof Leaf){ // 叶子
                ILeaf employee = (ILeaf) s;
                System.out.println(employee.getInfo());
            } else {
                IBranch branch = (IBranch) s;
                System.out.println(branch.getInfo());
                getAllSubordinateInfo(branch.getSubordinateInfo());
            }
        }
    }
}
