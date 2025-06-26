package stream;

import java.util.function.Predicate;

public class FilterStage<T> implements Stage{
    private final Predicate<? super T> predicate;

    public FilterStage(Predicate<? super T> predicate) {
        this.predicate = predicate;
    }

    @Override
    public Object accept(Object item) {
        System.out.println(item + "_filter");
        if (predicate.test((T)item)){
            return item;
        }
        return null;
    }
}
