package patterns.observerpubsub.demo5;


import java.util.Observable;
import java.util.Observer;

public class LiSi implements Observer {


    @Override
    public void update(Observable o, Object arg) {
            System.out.println("李斯观察到韩非活动，开始向始皇帝汇报。。。");
            this.reportToQinHang(arg.toString());
    }

    private void reportToQinHang(String context) {
            System.out.println("李斯：皇帝陛下，韩非有活动了------>" + context);
    }

}
