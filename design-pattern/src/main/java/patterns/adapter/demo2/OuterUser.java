package patterns.adapter.demo2;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        Map map = new HashMap();
        map.put("userName","shogun");
        map.put("mobileNumber","123456");
        return map;
    }

    @Override
    public Map getUserOfficeInfo() {

        Map map = new HashMap();
        map.put("jobPosition","Boss");
        map.put("officeTelNumber","654321");
        return map;
    }

    @Override
    public Map getUserHomeInfo() {
        Map map = new HashMap();
        map.put("userName","的船");
        map.put("homeAddress","江户");
        return map;

    }
}
