package patterns.abstractfactory.demo1;

/**
 * 车间
 * provide an interface for creating families of related or dependent objects without specifying their concrete classes.
 * 多条生产线，多个产品族
 */
public class NvWa {
    public static void main(String[] args) {
        // 第一条生产线
        HumanFactory maleHumanFactory = new MaleFactory();
        // 第二条生产线
        HumanFactory femaleHumanFactory = new FemaleFactory();

        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

        System.out.println("create a male yellow human");
        maleYellowHuman.getColor();
        maleYellowHuman.getSex();
        maleYellowHuman.talk();

        System.out.println("create a female yellow human");
        femaleYellowHuman.getColor();
        femaleYellowHuman.getSex();
        femaleYellowHuman.talk();
    }
}
