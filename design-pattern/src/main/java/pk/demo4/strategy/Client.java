package pk.demo4.strategy;

public class Client {
    public static void main(String[] args) {
        Context context;
        context = new Context(new Zip());
        context.compress("/root","/root.zip");
        context.uncompress("/root.zip","/root");
    }
}
