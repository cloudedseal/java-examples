package patterns.observerpubsub.demo3;

public class DuSi implements Observer{
    @Override
    public void update(String context) {
        System.out.println("杜斯观察到韩非活动，自己开始行动。。。");
        this.reportToQinHang(context);
    }

    private void reportToQinHang(String context) {
        System.out.println("杜斯：大笑了------>" + context);
    }
}
