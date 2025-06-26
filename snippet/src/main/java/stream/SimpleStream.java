package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SimpleStream<T> {

    private List<T> source;

    public SimpleStream(List<T> source) {
        this.source = source;
    }

    public static <T> SimpleStream<T> of(List<T> source){
        return new SimpleStream<>(source);
    }


    public SimpleStream<T> filter(Predicate<? super T> predicate){
        List<T> newSource = new ArrayList<>();
        for (T element : source) {
            System.out.println(element + "_filter");
            if (predicate == null || predicate.test(element)){
                newSource.add(element);
            }
        }
        this.source = newSource;
        return this;
    }

    public void forEach(Consumer<? super T> action){
        for (T element : source) {
            action.accept(element);
        }
    }

    public static void main(String[] args) {
        List<String> names =  Arrays.asList("aa","bbb");
        SimpleStream<String> stream = SimpleStream.of(names).filter(item -> item.length() > 2);
        stream.forEach(System.out::println);
    }

}
