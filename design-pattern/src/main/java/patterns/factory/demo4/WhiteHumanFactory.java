package patterns.factory.demo4;

import patterns.factory.demo1.Human;
import patterns.factory.demo1.WhiteHuman;
import patterns.factory.demo1.YellowHuman;

public class WhiteHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
