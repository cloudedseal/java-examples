package principle.lsp.demo3;

import java.util.Collection;
import java.util.Map;

public class Father {
    public Collection doSomething(Map map){
        System.out.println("父类被执行。。。");
        return map.values();
    }
}
