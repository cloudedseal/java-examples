package patterns.adapter.demo2;

import patterns.adapter.demo1.IUserInfo;
import patterns.adapter.demo1.UserInfo;

/**
 * 中转角色
 * Convert the interface of a class into another interface clients expect.
 * Adapter lets classes work together that couldn't otherwise because of
 * incompatible interfaces
 */
public class Client {
    public static void main(String[] args) {
        IUserInfo userInfo = new UserInfo();
        System.out.println(userInfo.getMobileNumber());

        userInfo = new OuterUserInfo();
        System.out.println(userInfo.getMobileNumber());
    }
}
