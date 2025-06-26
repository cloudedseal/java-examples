package principle.lsp.demo3;

import java.util.Collection;
import java.util.HashMap;

public class Son extends Father {

    public Collection doSomething(HashMap map) {
        System.out.println("子类被执行。。。");
        return map.values();
    }
}
