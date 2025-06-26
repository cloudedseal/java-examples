package patterns.flyweight.demo1;

public class SignInfoFactory {
    // 报名信息的对象工厂
    public static SignInfo getSignInfo(){
        return new SignInfo();
    }
}
