package patterns.abstractfactory.demo1;


import patterns.abstractfactory.demo1.Human;

public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种皮肤颜色是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白人会说话，一般说单音节字。");
    }

    @Override
    public void getSex() {

    }
}
