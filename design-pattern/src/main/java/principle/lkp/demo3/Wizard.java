package principle.lkp.demo3;

import java.util.Random;

public class Wizard {
    private Random rand = new Random(System.currentTimeMillis());

    public int first(){
        System.out.println("执行第一个方法。。。");
        return rand.nextInt(100);
    }

    public int second(){
        System.out.println("执行第二个方法。。。");
        return rand.nextInt(100);
    }

    public int third(){
        System.out.println("执行第三个方法。。。");
        return rand.nextInt(100);
    }
}
