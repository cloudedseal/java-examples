package patterns.builder.demo2;

import patterns.builder.demo1.BMWModel;
import patterns.builder.demo1.BenzModel;
import patterns.builder.demo1.CarModel;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder{
    private BMWModel bmw = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
