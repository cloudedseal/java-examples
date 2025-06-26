package patterns.builder.demo2;

import patterns.builder.demo1.BMWModel;
import patterns.builder.demo1.BenzModel;
import patterns.builder.demo1.CarModel;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        BenzModel benz;
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");

        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        benz = (BenzModel) benzBuilder.getCarModel();
        benz.run();
        System.out.println("-----------------");
        sequence = new ArrayList<>();
        sequence.add("start");
        sequence.add("engine boom");
        sequence.add("stop");
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
        bmw.run();

    }
}
