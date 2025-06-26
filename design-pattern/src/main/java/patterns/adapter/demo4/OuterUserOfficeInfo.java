package patterns.adapter.demo4;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo{
    @Override
    public Map getUserOfficeInfo() {
        Map map = new HashMap();
        map.put("jobPosition","Boss");
        map.put("officeTelNumber","654321");
        return map;
    }
}
