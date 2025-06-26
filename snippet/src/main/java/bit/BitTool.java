package bit;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.nio.ByteOrder;

public class BitTool {

    private static Unsafe unsafe;

    static {
        try {
            Field f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            unsafe = (Unsafe) f.get(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Failed to get Unsafe instance", e);
        }
    }

    public static Unsafe getUnsafe() {
        return unsafe;
    }

    static {
        unsafe = getUnsafe();
        long a = unsafe.allocateMemory(8);
        try {
            unsafe.putLong(a, 0x0102030405060708L);
            byte b = unsafe.getByte(a);
            switch (b) {
                case 0x01:
                    System.out.println(ByteOrder.BIG_ENDIAN);     break;
                case 0x08: System.out.println(ByteOrder.LITTLE_ENDIAN);  break;
                default:
                    assert false;
            }
        } finally {
            unsafe.freeMemory(a);
        }
    }
    public static boolean isPowerOfTwo(int val) {
        System.out.println(Integer.toBinaryString(val));
        System.out.println(Integer.toBinaryString(-val));
        return (val & -val) == val;
    }

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(24));

        byte b3 = (byte) 0x12;
        byte b2 = (byte) 0x34;
        byte b1 = (byte) 0x56;
//        byte b0 = (byte) 0x78;
        byte b0 = (byte) -0x78;

        System.out.println(Integer.toBinaryString(makeInt(b3, b2, b1, b0)));
        System.out.println(Integer.toBinaryString(makeIntWrong(b3, b2, b1, b0)));
        System.out.println(Integer.toBinaryString(-10));
    }

    static private int makeInt(byte b3, byte b2, byte b1, byte b0) {
        return (((b3       ) << 24) |
                ((b2 & 0xff) << 16) |
                ((b1 & 0xff) <<  8) |
                ((b0 & 0xff)      ));
    }

    static private int makeIntWrong(byte b3, byte b2, byte b1, byte b0) {
        return (((b3       ) << 24) |
                ((b2 ) << 16) |
                ((b1 ) <<  8) |
                ((b0 )      ));
    }


}
