package patterns.mediator.demo2;

/**
 * 处理多个对象间的逻辑
 * Define an object that encapsulate how a set of objects interact.
 * Mediator promotes loose coupling by keeping objects from referring to each other
 * explicitly, and it lets you vary their interaction independently.
 * 封装对象之间的逻辑
 * 蜘蛛网状的逻辑，转为星型结构。中央集权，对象间逻辑集中到 mediator。
 * 调停者模式
 * 前端控制器 DispatcherServletController
 */

public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        this.purchase = new Purchase(this);
        this.sale = new Sale(this);
        this.stock = new Stock(this);
    }

    // 多个对象之间的调解者
    public abstract void execute(String str, Object ...objects);
}
