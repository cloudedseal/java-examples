package structure;

import java.util.concurrent.atomic.AtomicReference;


public class TreiberStack<E> {
    private final AtomicReference<Node<E>> stackTop = new AtomicReference<Node<E>>();

    public void push(E val) {
        Node<E> newHeadNode = new Node<>(val);
        Node<E> oldHeadNode;

        do {
            oldHeadNode = stackTop.get(); // get old stack top
            newHeadNode.setNext(oldHeadNode); // link old stack top
        } while (!stackTop.compareAndSet(oldHeadNode, newHeadNode)); // new stack top
    }

    public E pop() {
        Node<E> newHeadNode;
        Node<E> oldHeadNode;

        do {
            oldHeadNode = stackTop.get();
            if (oldHeadNode == null) {
                return null;
            }
            newHeadNode = oldHeadNode.getNext();
        } while (!stackTop.compareAndSet(oldHeadNode, newHeadNode));
        return oldHeadNode.getVal();
    }

    public int size() {
        if (stackTop.get() == null) {
            return 0;
        }
        int size = 0;
        Node<E> current = stackTop.get();
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

}

class Node<E> {
    private E val;
    private Node<E> next;

    public Node(E val) {
        this.val = val;
    }

    public E getVal() {
        return val;
    }

    public void setVal(E val) {
        this.val = val;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}