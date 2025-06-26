package patterns.adapter.demo4;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo{
    @Override
    public Map getUserBaseInfo() {
        Map map = new HashMap();
        map.put("userName","shogun");
        map.put("mobileNumber","123456");
        return map;
    }

}
