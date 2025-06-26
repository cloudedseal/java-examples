package patterns.singleton.demo1;

public class Emperor {
    private static final Emperor emperor = new Emperor();

    private Emperor() {
        // prevent to create new instance
    }

    public static Emperor getInstance(){
        return emperor;
    }

    // 类中其他方法尽量是 static
    public static void say(){
        System.out.println("I'm emperor");
    }
}
