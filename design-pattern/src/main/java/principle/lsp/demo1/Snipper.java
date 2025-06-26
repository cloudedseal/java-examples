package principle.lsp.demo1;

public class Snipper {
    private AUG rifle;

    public void setRifle(AUG rifle) {
        this.rifle = rifle;
    }

    public void killEnemy(){
        rifle.zoomOut();
        rifle.shoot();
    }
}
