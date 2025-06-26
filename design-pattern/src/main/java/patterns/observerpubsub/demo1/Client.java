package patterns.observerpubsub.demo1;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();

        Spy spy = new Spy(hanFeiZi,liSi,"breakfast");
        spy.start();
        Spy spy2 = new Spy(hanFeiZi,liSi,"fun");
        spy2.start();
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
