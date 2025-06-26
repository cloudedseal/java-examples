package stream;

import java.util.function.Function;

public class MapStage<T, R> implements Stage{
    private final Function<? super T, ? extends R> mapper;

    public MapStage(Function<? super T, ? extends R> mapper) {
        this.mapper = mapper;
    }

    @Override
    public Object accept(Object item) {
        System.out.println(item + "_map");
        return mapper.apply((T) item);
    }
}
