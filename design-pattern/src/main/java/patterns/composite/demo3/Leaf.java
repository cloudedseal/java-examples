package patterns.composite.demo3;



public class Leaf extends Corp {

    private String name;
    private String position;
    private int salary;

    public Leaf(String name, String position, int salary) {
        super(name, position, salary);
    }

}
