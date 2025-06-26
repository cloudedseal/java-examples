package patterns.decorator.demo1;

public class ForthGradeSchoolReport extends SchoolReport{
    @Override
    public void report() {
        System.out.println("尊敬的XXX家长");
        System.out.println(".........");
        System.out.println("语文 56 数学 39 体育 99 自然 89");
        System.out.println(".........");
        System.out.println("家长签名：     " );
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为：" + name);
    }
}
