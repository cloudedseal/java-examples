package patterns.adapter.demo2;

import patterns.adapter.demo1.IUserInfo;

import java.util.Map;

/**
 * 220V电源 ====> 电源适配器 ====> 低电压电器，比如电脑
 * 电源适配器就是中转角色
 *
 * 中转角色
 * Convert the interface of a class into another interface clients expect.
 * Adapter lets classes work together that couldn't otherwise because of
 * incompatible interfaces
 * 把一个接口或类转换成其他的接口或类
 * 第三者-中间层
 * extends 一个 implement 一个
 * 将 OuterUser 类转换为期望的接口 IUserInfo 自有的接口嘛，这就是所谓的适配
 * OuterUser 就是源角色，被包装的类
 * OuterUserInfo 就是适配器类
 */
public class OuterUserInfo  extends OuterUser implements IUserInfo {

    private Map baseInfo = super.getUserBaseInfo();
    private Map homeInfo = super.getUserHomeInfo();
    private Map officeInfo = super.getUserOfficeInfo();

    @Override
    public String getUserName() {
        String userName = (String) this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String) this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = (String) this.officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
