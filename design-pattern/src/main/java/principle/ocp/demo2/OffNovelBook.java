package principle.ocp.demo2;

import principle.ocp.demo1.NovelBook;

/**
 * 以子类的方式，应对需求变更。
 * 不直接修改 NovelBook
 * open closed principle
 */
public class OffNovelBook extends NovelBook {
    public OffNovelBook(String name, int price, String author) {
        super(name, price, author);
    }

    @Override
    public int getPrice() {
        int selfPrice = super.getPrice();
        int offPrice = 0;
        if (selfPrice > 4000){
            offPrice = selfPrice * 90 / 100;
        } else {
            offPrice = selfPrice * 80 / 100;
        }
        return offPrice;
    }
}
