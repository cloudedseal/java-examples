package patterns.template.demo4;



public class Client {
    public static void main(String[] args) {
        HummerH1Model h1 = new HummerH1Model();
        h1.run();

        System.out.println("--------------------");
        // 通过设置这个来影响 run 方法的执行，这就是所谓的钩子方法
        h1.setAlarm(false);
        h1.run();

        System.out.println("--------------------");
        HummerH2Model h2 = new HummerH2Model();
        h2.run();


    }
}
