package principle.lsp.demo3;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        invoker();
    }

    private static void invoker() {
         Son f = new Son();
        HashMap map = new HashMap();
        f.doSomething(map);
    }
}
