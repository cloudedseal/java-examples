package patterns.facade.demo4;

public class Facade2 {
    private Facade facade = new Facade();


    // 提供给外部访问的方法
    public void methodB(){
        this.facade.methodB();
    }


}
