package lock;

import sun.misc.Unsafe;

public class FieldOffsetExample {
    private static  Unsafe UNSAFE = null;

    static {
        try {
            UNSAFE = getUnsafe();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int myField = 42;

    public static void main(String[] args) throws Exception {
        long offset = UNSAFE.objectFieldOffset(
            FieldOffsetExample.class.getDeclaredField("myField")
        );
        System.out.println("Field offset: " + offset);
    }

    private static Unsafe getUnsafe() throws Exception {
        java.lang.reflect.Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (Unsafe) f.get(null);
    }
}