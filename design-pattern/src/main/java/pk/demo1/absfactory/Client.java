package pk.demo1.absfactory;

public class Client {
    public static void main(String[] args) {
        CarFactory benzFactory = new BenzFactory();
        ICar suv = benzFactory.createSuv();
        System.out.println(suv.getBand());
    }
}
