package patterns.mediator.demo2;

/**
 * 采购
 */
public class Purchase extends AbstractColleague{
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyIBMComputer(int number){
        // 委托给 mediator
        super.mediator.execute("purchase.buy", number);
    }

    public void refuseBuy(){
        System.out.println("不再采购 IBM 电脑");
    }
}
