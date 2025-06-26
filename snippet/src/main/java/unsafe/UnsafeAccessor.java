package unsafe;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public class UnsafeAccessor {
    public static Unsafe getUnsafeInstance() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true); // Allow access to the private field
            return (Unsafe) field.get(null); // Get the static field value
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Failed to get Unsafe instance", e);
        }
    }

}