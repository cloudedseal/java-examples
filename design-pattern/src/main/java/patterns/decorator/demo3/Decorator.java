package patterns.decorator.demo3;

import patterns.decorator.demo1.SchoolReport;

/**
 * Attach additional responsibilities to an object dynamically keeping the same interface.
 * Decorators provide a flexible alternative to subclassing for extending functionality.
 * 组合装饰类，防止类爆炸
 */

public class Decorator extends SchoolReport {
    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    // 委托
    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
