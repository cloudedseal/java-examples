package patterns.singleton.demo1;

public class Minister {
    public static void main(String[] args) {
        for (int day = 0; day < 3; day++) {
            Emperor emperor = Emperor.getInstance();
            System.out.println(emperor);
            emperor.say();
        }
    }
}
