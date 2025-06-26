package patterns.builder.demo1;

import java.util.ArrayList;

public abstract class CarModel {

    // 基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<>();
    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

    public final void run(){
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            switch (actionName){
                case "start":
                    this.start();
                    break;
                case "stop":
                    this.stop();
                    break;
                case "alarm":
                    this.alarm();
                    break;
                case "engine boom":
                    this.engineBoom();
                    break;
            }
        }
    }

    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
