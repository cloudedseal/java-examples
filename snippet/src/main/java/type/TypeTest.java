package type;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class TypeTest {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        System.out.println(l1.getClass() == l2.getClass());
        TypeReference<List<String>> ref = new TypeReference<List<String>>(){};
        Type type = ref.getType(); // java.util.List<java.lang.String>
        System.out.println(type);
    }
}
