package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SimpleStream3<T> {

    private List<T> source;
    // 保存 操作
    private Predicate<? super T> predicate;
    // 其他的操作呢？？？
//    private Predicate<? super T> predicate;

    // stream 流经一个地方要么接着流下去要么终止了

    public SimpleStream3(List<T> source) {
        this.source = source;
    }

    public static <T> SimpleStream3<T> of(List<T> source){
        return new SimpleStream3<>(source);
    }


    public SimpleStream3<T> filter(Predicate<? super T> predicate){
        this.predicate = predicate;
//        延迟计算
//        List<T> newSource = new ArrayList<>();
//        for (T element : source) {
//            System.out.println(element + "_filter");
//            if (predicate == null || predicate.test(element)){
//                newSource.add(element);
//            }
//        }
//        this.source = newSource;
        return this;
    }


   // forEach 就是所谓终端操作
    public void forEach(Consumer<? super T> action){
        for (T element : source) {
            System.out.println(element + "_filter");
            if (predicate == null || predicate.test(element)){
                action.accept(element);
            }
        }
    }

    public static void main(String[] args) {
        List<String> names =  Arrays.asList("aa","bbb");
        SimpleStream3<String> stream = SimpleStream3.of(names).filter(item -> item.length() > 2);
        stream.forEach(System.out::println);
    }

}
