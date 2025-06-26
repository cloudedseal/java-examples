package patterns.observerpubsub.demo3;

public class WangSi implements Observer{
    @Override
    public void update(String context) {
        System.out.println("王斯观察到韩非活动，开始跑了。。。");
        this.reportToQinHang(context);
    }

    private void reportToQinHang(String context) {
        System.out.println("王斯：韩非有活动了------>" + context);
    }
}
