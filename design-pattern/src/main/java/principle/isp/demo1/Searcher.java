package principle.isp.demo1;

public class Searcher extends AbstractSearcher{
    public Searcher(IPrettyGirl prettyGirl) {
        super(prettyGirl);
    }

    @Override
    public void show() {
        System.out.println("-----beauty info----");
        super.prettyGirl.goodLooking();
        super.prettyGirl.niceFigure();
        super.prettyGirl.greatTemperament();
    }
}
