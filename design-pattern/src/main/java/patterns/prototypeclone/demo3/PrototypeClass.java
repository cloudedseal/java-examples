package patterns.prototypeclone.demo3;

public class PrototypeClass implements Cloneable{
    @Override
    protected PrototypeClass clone() {
        try {
            return (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
