package patterns.adapter.demo1;

public class UserInfo implements IUserInfo{
    @Override
    public String getUserName() {
        System.out.println("员工姓名是。。。");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("员工家庭住址。。。");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("员工手机号。。。");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("员工办公电话。。。");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("员工职位是。。。");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("员工家庭电话是。。。");
        return null;
    }
}
