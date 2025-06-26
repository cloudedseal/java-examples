package patterns.decorator.demo3;

import patterns.decorator.demo1.SchoolReport;

public class HighScoreDecorator extends Decorator{
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }

    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是99");
    }
}
