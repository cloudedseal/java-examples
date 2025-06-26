package patterns.decorator.demo2;

import patterns.decorator.demo1.ForthGradeSchoolReport;

public class SugarFourthGradeSchoolReport extends ForthGradeSchoolReport {

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }

    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是99");
    }

    private void reportSort(){
            System.out.println("我是排名第38名...");
    }
}
