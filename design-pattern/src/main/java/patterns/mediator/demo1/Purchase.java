package patterns.mediator.demo1;

/**
 * 采购
 */
public class Purchase {
    public void buyIBMComputer(int number){
        // 访问库存
        Stock stock = new Stock();
        // 访问销售
        Sale sale = new Sale();
        // 销售情况
        int saleStatus = sale.getSaleStatus();
        if (saleStatus > 80){ // 销售良好
            System.out.println("采购IBM电脑:" + number + "台");
            // 添加库存
            stock.increase(number);
        } else {
            int buyNumber = number / 2; // 砍一半
            System.out.println("采购IBM电脑:" + buyNumber + "台");
            stock.increase(buyNumber);
        }
    }

    public void refuseBuy(){
        System.out.println("不再采购 IBM 电脑");
    }
}
