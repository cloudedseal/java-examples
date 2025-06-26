package patterns.factory.demo3;

import patterns.factory.demo1.*;

/**
 * 场景类
 */
public class NvWa {
    public static void main(String[] args) {

        System.out.println("create white people");
        WhiteHuman whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("create black people");
        BlackHuman blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("create yellow people");
        YellowHuman yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
