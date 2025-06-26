package principle.isp.demo2;


public class PrettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {
    private String name;

    public PrettyGirl(String name) {
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(this.name + "---good Looking!");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + "---niceFigure!");
    }

    @Override
    public void greatTemperament() {
        System.out.println(this.name + "---greatTemperament!");
    }
}
