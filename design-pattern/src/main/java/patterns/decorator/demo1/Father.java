package patterns.decorator.demo1;

public class Father {
    public static void main(String[] args) {
        SchoolReport sr = new ForthGradeSchoolReport();
        sr.report();
    }
}
