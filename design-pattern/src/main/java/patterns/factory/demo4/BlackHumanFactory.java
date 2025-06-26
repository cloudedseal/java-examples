package patterns.factory.demo4;

import patterns.factory.demo1.BlackHuman;
import patterns.factory.demo1.Human;

public class BlackHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
