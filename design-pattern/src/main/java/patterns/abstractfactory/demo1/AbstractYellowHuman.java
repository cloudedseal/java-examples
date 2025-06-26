package patterns.abstractfactory.demo1;


import patterns.abstractfactory.demo1.Human;

public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种皮肤颜色是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄人会说话，一般说双音节字。");
    }

    @Override
    public void getSex() {

    }
}
