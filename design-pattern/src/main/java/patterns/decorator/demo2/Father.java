package patterns.decorator.demo2;

import patterns.decorator.demo1.SchoolReport;

public class Father {
    public static void main(String[] args) {
        SchoolReport sr = new SugarFourthGradeSchoolReport();
        sr.report();
        sr.sign("Shogun");
    }
}
