package principle.srp.demo1;

public interface IUserBiz {
    boolean changePassword(String oldPassword);
    boolean deleteUser();
    void mapUser();
    boolean addOrg(int orgId);
    boolean addRole(int roleId);
}
