package patterns.iterator.demo3;

public class Client {
    public static void main(String[] args) {
        Aggregate agg = new ConcreteAggregate();
        agg.add("aaa");
        agg.add("bbb");
        agg.add("ccc");

        Iterator iterator = agg.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
