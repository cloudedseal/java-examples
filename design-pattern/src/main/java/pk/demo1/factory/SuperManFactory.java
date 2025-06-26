package pk.demo1.factory;

/**
 * 工厂模式, 关注一个产品的整体，不关心细节
 */
public class SuperManFactory {
    public static ISuperMan createSuperMan(String type){
        if (type.equalsIgnoreCase("adult")){
            return new AdultSuperMan();
        } else if (type.equalsIgnoreCase("child")){
            return new ChildSuperMan();
        } else {
            return null;
        }
    }
}
