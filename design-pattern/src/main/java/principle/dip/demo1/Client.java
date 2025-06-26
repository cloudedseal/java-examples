package principle.dip.demo1;

public class Client {
    public static void main(String[] args) {
        Driver zhang = new Driver();
        Benz benz = new Benz();
        zhang.drive(benz);
    }
}
