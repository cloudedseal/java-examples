package patterns.chainofresponsibility.demo2;



import patterns.chainofresponsibility.demo1.IWomen;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4),"出去逛街"));
        }

        // 链表头节点
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNextHandler(husband);
        husband.setNextHandler(son);

        for (IWomen women : arrayList) {
//            if (women.getType() == 1){
//                System.out.println("女儿向父亲请求");
//                father.handleMessage(women);
//                System.out.println("----------");
//            } else if (women.getType() == 2){
//                System.out.println("妻子向丈夫请求");
//                husband.handleMessage(women);
//                System.out.println("----------");
//            } else if (women.getType() == 3){
//                System.out.println("母亲向儿子请求");
//                son.handleMessage(women);
//                System.out.println("----------");
//            }
            father.handleMessage(women);
            System.out.println("----------");
        }

    }
}
