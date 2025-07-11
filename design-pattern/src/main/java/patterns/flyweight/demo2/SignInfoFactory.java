package patterns.flyweight.demo2;

import patterns.flyweight.demo1.SignInfo;

import java.util.HashMap;

/**
 * use sharing to support large numbers of fine-grained  objects effciently.
 * 大量细粒度的对象
 */
public class SignInfoFactory {
    private static HashMap<String,SignInfo> pool = new HashMap<>();
    // 报名信息的对象工厂
    @Deprecated
    public static SignInfo getSignInfo(){
        return new SignInfo();
    }
    public static SignInfo getSignInfo(String key){
        SignInfo result = null;
        if (!pool.containsKey(key)){
            System.out.println(key + "---创建新对象，放入池中");
            result = new SignInfo4Pool(key);
            pool.put(key,result);
        } else {
            result = pool.get(key);
            System.out.println(key + "---直接从池中取得");
        }
        return result;
    }
}
