package type;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

abstract class TypeReference<T> {
    private final Type type;

    protected TypeReference() {
        Type superClass = getClass().getGenericSuperclass();
        if (superClass instanceof ParameterizedType) {
            this.type = ((ParameterizedType) superClass).getActualTypeArguments()[0];
        } else {
            throw new IllegalArgumentException("Invalid TypeReference");
        }
    }

    public Type getType() {
        return type;
    }
}