package patterns.composite.demo4;

public class Client {
    public static void main(String[] args) {
        // 根节点
        Composite root = new Composite();
        root.doSomething();

        // 树枝
        Composite branch = new Composite();

        // 叶子
        Leaf leaf = new Leaf();
        
        root.add(branch);
        branch.add(leaf);
        display(root);
    }

    private static void display(Composite root) {
        root.doSomething();
        for (Component child : root.getChildren()) {
            if (child instanceof Leaf){
                child.doSomething();
            } else {
                display((Composite) child);
            }
        }
    }
}
