package principle.lsp.demo1;

public class Client2 {
    public static void main(String[] args) {
        Snipper san = new Snipper();
        san.setRifle(new AUG());
        san.killEnemy();

        // not work, 用子类的地方，不能用父类
//        Exception in thread "main" java.lang.ClassCastException: principle.lsp.demo1.Rifle cannot be cast to principle.lsp.demo1.AUG
//        at principle.lsp.demo1.Client2.main(Client2.java:9)
//        san.setRifle((AUG) new Rifle());
        san.killEnemy();
    }
}
