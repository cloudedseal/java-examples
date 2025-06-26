package patterns.adapter.demo4;

import patterns.adapter.demo1.IUserInfo;
import patterns.adapter.demo2.OuterUser;

import java.util.Map;

/**
 * 中转角色
 * Convert the interface of a class into another interface clients expect.
 * Adapter lets classes work together that couldn't otherwise because of
 * incompatible interfaces
 * 把一个接口或类转换成其他的接口或类
 * 第三者-中间层
 * extends 一个 implement 一个
 * 将 OuterUser 类转换为期望的接口 IUserInfo 自有的接口嘛
 * OuterUser 就是源角色，被包装的类
 * OuterUserInfo 就是适配器类
 */
public class OuterUserInfo implements IUserInfo {

    private IOuterUserBaseInfo baseInfo;
    private IOuterUserHomeInfo homeInfo;
    private IOuterUserOfficeInfo officeInfo;

    private Map baseMap;
    private Map homeMap;
    private Map officeMap;

    public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
        this.baseInfo = baseInfo;
        this.homeInfo = homeInfo;
        this.officeInfo = officeInfo;
        this.baseMap = this.baseInfo.getUserBaseInfo();
        this.homeMap = this.homeInfo.getUserHomeInfo();
        this.officeMap = this.officeInfo.getUserOfficeInfo();
    }

    @Override
    public String getUserName() {
        String userName = (String) this.baseMap.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String) this.homeMap.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeMap.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = (String) this.officeMap.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeMap.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
