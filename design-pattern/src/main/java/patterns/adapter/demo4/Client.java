package patterns.adapter.demo4;

public class Client {
    public static void main(String[] args) {
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();

        OuterUserInfo info = new OuterUserInfo(baseInfo, homeInfo, officeInfo);
        System.out.println(info.getMobileNumber());
    }
}
