package patterns.composite.demo3;




import java.util.ArrayList;

public class Branch extends Corp {
    private ArrayList<Corp> subordinateList = new ArrayList();
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }



    public void add(Corp corp) {
        this.subordinateList.add(corp);
    }


    public ArrayList getSubordinateInfo() {
        return this.subordinateList;
    }


}
