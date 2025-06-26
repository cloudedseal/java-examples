package patterns.prototypeclone.demo4;

public class Client {
    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("张三");
        System.out.println(thing.getValue().hashCode());
        Thing cloneThing = thing.clone();
        cloneThing.setValue("里斯");

        System.out.println(cloneThing.getValue().hashCode());
        System.out.println(thing.getValue());
    }
}
