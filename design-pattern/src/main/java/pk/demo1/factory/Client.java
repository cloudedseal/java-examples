package pk.demo1.factory;

public class Client {
    public static void main(String[] args) {
        ISuperMan adultSuperMan = SuperManFactory.createSuperMan("adult");
        adultSuperMan.specialTalent();
    }
}
