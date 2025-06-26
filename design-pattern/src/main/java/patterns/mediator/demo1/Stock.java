package patterns.mediator.demo1;

/**
 * 库存
 */
public class Stock {
    private static int COMPUTER_NUMBER = 100;

    // 加库存
    public  void increase(int number){
        COMPUTER_NUMBER += number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    // 减库存
    public void decrease(int number){
        COMPUTER_NUMBER -= number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }

    public void clearStock(){
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        System.out.println("清理存货数量为：" + COMPUTER_NUMBER);
        // 折价
        sale.offSale();
        // 不要再采购
        purchase.refuseBuy();

    }
}
