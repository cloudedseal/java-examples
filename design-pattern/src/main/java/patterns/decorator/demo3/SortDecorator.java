package patterns.decorator.demo3;

import patterns.decorator.demo1.SchoolReport;

public class SortDecorator extends Decorator{
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }

    private void reportSort() {
        System.out.println("我是排名第38名...");
    }
}
