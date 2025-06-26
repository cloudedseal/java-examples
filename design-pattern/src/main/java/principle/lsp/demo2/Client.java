package principle.lsp.demo2;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        invoker();
    }

    private static void invoker() {
        Father f = new Father();
         f = new Son();
        HashMap map = new HashMap();
        f.doSomething(map);
    }
}
