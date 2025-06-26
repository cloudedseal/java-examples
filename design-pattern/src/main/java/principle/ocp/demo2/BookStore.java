package principle.ocp.demo2;

import principle.ocp.demo1.IBook;
import principle.ocp.demo1.NovelBook;

import java.text.NumberFormat;
import java.util.ArrayList;

public class BookStore {
    private final static ArrayList<IBook> bookList = new ArrayList<>();

    static {
        bookList.add(new OffNovelBook("天龙八部",3200,"金庸"));
        bookList.add(new OffNovelBook("巴黎圣母院",5500,"雨果"));
        bookList.add(new OffNovelBook("悲惨世界",3500,"雨果"));
        bookList.add(new OffNovelBook("水浒传",3100,"施耐庵"));
    }

    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        formatter.setMaximumFractionDigits(2);
        System.out.println("-------------书店卖出去的书籍--------------");
        for (IBook book : bookList) {
            System.out.println("name: " + book.getName() + "\t" + "author: " + book.getAuthor() + "\t" + "price: " + formatter.format(book.getPrice() / 100));
        }
    }
}
