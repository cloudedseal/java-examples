package patterns.builder.demo2;

import patterns.builder.demo1.BenzModel;
import patterns.builder.demo1.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder{
    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
