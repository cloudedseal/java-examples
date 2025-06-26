package principle.isp.demo1;

public class Client {
    public static void main(String[] args) {
        IPrettyGirl shogun = new PrettyGirl("哈哈");
        AbstractSearcher searcher = new Searcher(shogun);
        searcher.show();
    }
}
