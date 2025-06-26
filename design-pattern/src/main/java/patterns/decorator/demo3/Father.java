package patterns.decorator.demo3;

import patterns.decorator.demo1.ForthGradeSchoolReport;
import patterns.decorator.demo1.SchoolReport;

public class Father {
    public static void main(String[] args) {
        SchoolReport sr = new ForthGradeSchoolReport();
        // 用 HighScoreDecorator 装饰原始的 SchoolReport
        sr = new HighScoreDecorator(sr);
        // 用 SortDecorator 装饰 HighScoreDecorator
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("Shogun");
    }
}
