package patterns.prototypeclone.demo4;

import java.util.ArrayList;

public class Thing implements Cloneable{
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    public Thing clone() {
        try {
            return (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setValue(String value){
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue(){
        return this.arrayList;
    }


}
