package patterns.facade.demo3;


public class Client {
    public static void main(String[] args) {
        ModenPostOffice office = new ModenPostOffice();
        String address = "heaven101";
        String context = "hello, goodbye";
        office.sendLetter(context,address);
    }
}
