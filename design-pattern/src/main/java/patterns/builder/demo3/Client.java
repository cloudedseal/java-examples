package patterns.builder.demo3;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        for (int i = 0; i < 10; i++) {
            director.getABenzModel().run();
        }

        for (int i = 0; i < 10; i++) {
            director.getBBenzModel().run();
        }
    }
}
