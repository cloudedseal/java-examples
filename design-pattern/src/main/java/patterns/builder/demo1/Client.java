package patterns.builder.demo1;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        BenzModel benz = new BenzModel();
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        benz.setSequence(sequence);
        benz.run();

        System.out.println("-----------------");
        sequence = new ArrayList<>();
        sequence.add("start");
        sequence.add("engine boom");
        sequence.add("stop");
        BMWModel bmw = new BMWModel();
        bmw.setSequence(sequence);
        bmw.run();

        // 大量的 sequence ，一个一个定义？
    }
}
