package pk.demo4.command;

public class Client {
    public static void main(String[] args) {
        AbstractCmd cmd = new ZipCompressCmd();

        Invoker invoker = new Invoker(cmd);
        invoker.execute("/root","root.zip");
    }
}
