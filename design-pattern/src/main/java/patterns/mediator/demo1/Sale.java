package patterns.mediator.demo1;

import java.util.Random;

public class Sale {

    public void sellIBMComputer(int number){
        // 访问库存
        Stock stock = new Stock();
        // 访问采购
        Purchase purchase = new Purchase();

        // 库存不够
        if (stock.getStockNumber() < number){
            purchase.buyIBMComputer(number);
        }

        stock.decrease(number);
    }

    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑销售情况为" + saleStatus);
        return saleStatus;
    }

    public void offSale() {
        Stock stock = new Stock();
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
    }
}
