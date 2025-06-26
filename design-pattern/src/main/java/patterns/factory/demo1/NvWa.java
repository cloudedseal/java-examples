package patterns.factory.demo1;

/**
 * 场景类
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory yinyangLu = new HumanFactory();

        System.out.println("create white people");
        WhiteHuman whiteHuman = yinyangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("create black people");
        BlackHuman blackHuman = yinyangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("create yellow people");
        YellowHuman yellowHuman = yinyangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
