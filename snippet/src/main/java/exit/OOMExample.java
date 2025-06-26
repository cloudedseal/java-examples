package exit;

import java.util.HashSet;
import java.util.Set;

public class OOMExample {
    public static void main(String[] args) {
        Set<byte[]> arr = new HashSet<>();
        while (true) {
            byte[] bytes = new byte[1024 * 1024 * 10];// Allocate 10MB repeatedly until OOM
            arr.add(bytes);
            System.out.println(bytes.length);
            System.out.println(arr.size());

        }
    }
}