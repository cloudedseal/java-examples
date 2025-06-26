package patterns.composite.demo3;




import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Branch ceo = compositeCorpTree();

        System.out.println(ceo.getInfo());
        getAllSubordinateInfo(ceo.getSubordinateInfo());
        System.out.println("------");
        System.out.println(getTreeInfo(ceo));

    }

    private static String getTreeInfo(Branch ceo) {
        String info = "";
        info += ceo.getInfo();
        ArrayList child = ceo.getSubordinateInfo();
        for (Object o : child) {
            if (o instanceof Leaf){
                info += ((Leaf) o).getInfo();
            } else {
                info += ((Branch) o).getInfo();
                getTreeInfo((Branch) o);
            }
        }
        return info;
    }

    private static Branch compositeCorpTree() {
        // 创建一个 root
        Branch ceo = new Branch("尔朱荣","CEO",100000);
        Branch developDep = new Branch("高欢","Shogun1",2000);
        Branch saleDep = new Branch("宇文泰","Shogun2",4000);
        Branch financeDep = new Branch("独孤信","Shogun3",6000);

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
                Leaf employee = (Leaf) s;
                System.out.println(employee.getInfo());
            } else {
                Branch branch = (Branch) s;
                System.out.println(branch.getInfo());
                getAllSubordinateInfo(branch.getSubordinateInfo());
            }
        }
    }
}
