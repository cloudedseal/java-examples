package patterns.builder.demo2;

import patterns.builder.demo1.CarModel;

/**
 * Separate the construction of a complex object from its representation
 * so that the same construction can create different representations
 * 一个产品一个 builder，基本方法的调用顺序，顺序不同，生产的产品不同
 */
import java.util.ArrayList;

public abstract class CarBuilder {
    public abstract void setSequence(ArrayList<String> sequence);
    public abstract CarModel getCarModel();
}
