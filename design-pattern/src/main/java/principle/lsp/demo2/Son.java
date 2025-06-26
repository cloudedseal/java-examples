package principle.lsp.demo2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son extends Father{
    // HashMap -> Map 放大输入参数类型
    // 参数不同，不是 override，这是 overload
    // 子类有父类的所有属性和方法
    public Collection doSomething(Map map) {
        System.out.println("子类被执行。。。");
        return map.values();
    }

    @Override
    public Collection doSomething(HashMap map) {
        System.out.println("子类重写。。。");
        return super.doSomething(map);
    }
}
