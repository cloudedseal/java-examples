package principle.lsp.demo1;

public class Client {
    public static void main(String[] args) {
        Soldier san = new Soldier();

        san.setGun(new Rifle());

        san.killEnemy();

        san.setGun(new ToyGun());
        san.killEnemy();
    }
}
