package patterns.adapter.demo4;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo{
    @Override
    public Map getUserHomeInfo() {
        Map map = new HashMap();
        map.put("userName","的船");
        map.put("homeAddress","江户");
        return map;
    }


}
