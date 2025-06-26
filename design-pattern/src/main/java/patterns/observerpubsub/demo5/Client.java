package patterns.observerpubsub.demo5;


import java.util.Observer;

public class Client {
    public static void main(String[] args) {
        // 观察者们
        Observer liSi = new LiSi();


        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(liSi);


        hanFeiZi.haveBreakfast();
    }
}
