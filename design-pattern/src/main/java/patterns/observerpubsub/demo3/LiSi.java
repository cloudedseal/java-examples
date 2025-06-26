package patterns.observerpubsub.demo3;

public class LiSi implements Observer{
    @Override
    public void update(String context) {
        System.out.println("李斯观察到韩非活动，开始向始皇帝汇报。。。");
        this.reportToQinHang(context);
    }

    private void reportToQinHang(String context) {
        System.out.println("李斯：皇帝陛下，韩非有活动了------>" + context);
    }
}
