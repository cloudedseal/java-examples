package principle.dip.demo2;

/**
 * 高层模块，业务场景类，需要依赖底层的模块
 */
public class Client {
    public static void main(String[] args) {
        Driver zhang = new Driver();
        Benz benz = new Benz();
        zhang.drive(benz);

        BMW bmw = new BMW();
        zhang.drive(bmw);
    }
}
