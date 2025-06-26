package patterns.decorator.demo1;

/**
 * 成绩单
 */
public abstract class SchoolReport {

    // 成绩状况
    public abstract void report();

    // 签名
    public abstract void sign(String name);
}
