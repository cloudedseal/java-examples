package principle.srp.demo1;

/**
 * 用户属性、用户行为没有分开
 * 用户信息 -> 业务对象 business object
 * 用户行为 -> 业务逻辑 business logic
 * 单一职责 有且仅有一个原因引起类的变更
 * Single responsibility principle
 * there should never be more than one reason for a class to change.
 */
public interface IUserInfo {
    void setUserId(String userId);
    String getUserID();
    void setPassword(String password);
    String getPassword();
    void setUserName(String userName);
    String getUserName();
    boolean changePassword(String oldPassword);
    boolean deleteUser();
    void mapUser();
    boolean addOrg(int orgId);
    boolean addRole(int roleId);
}
