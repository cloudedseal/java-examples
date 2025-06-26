package patterns.prototypeclone.demo5;

import java.util.ArrayList;

public class Thing implements Cloneable{
//    private final ArrayList<String> arrayList = new ArrayList<>();
    private  ArrayList<String> arrayList = new ArrayList<>();

    @Override
    public Thing clone() {
        try {
            Thing thing = (Thing) super.clone();
            // 深拷贝
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
            return thing;
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

