package patterns.factory.demo4;

import patterns.factory.demo1.*;

/**
 * 场景类
 */
public class NvWa {
    public static void main(String[] args) {

        System.out.println("create white people");
        Human whiteHuman = (new WhiteHumanFactory()).createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("create black people");
        Human blackHuman = (new BlackHumanFactory()).createHuman();
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("create yellow people");
        Human yellowHuman = (new YellowHumanFactory()).createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
