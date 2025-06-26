package patterns.observerpubsub.demo3;

public class Client {
    public static void main(String[] args) {
        // 观察者们
        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();
        Observer duSi = new DuSi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(duSi);

        hanFeiZi.haveBreakfast();
    }
}
