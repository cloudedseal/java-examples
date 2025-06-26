package patterns.factory.demo4;

import patterns.factory.demo1.BlackHuman;
import patterns.factory.demo1.Human;
import patterns.factory.demo1.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
