package pk.demo3.adapter;

import pk.demo3.decorator.WhiteSwan;

public class UglyDuckling extends WhiteSwan implements Duck {
    @Override
    public void cry() {
        super.cry();
    }

    @Override
    public void desAppearance() {
        super.desAppearance();
    }

    @Override
    public void desBehavior() {
        System.out.println("会游泳");
        super.fly();
    }
}
