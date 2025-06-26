package patterns.flyweight.demo1;

public class Client {
    public static void main(String[] args) {
        // 考虑百万级别对对象个数，非常非常占内存。
        // 使用对象池
        SignInfo signInfo = SignInfoFactory.getSignInfo();
    }
}
