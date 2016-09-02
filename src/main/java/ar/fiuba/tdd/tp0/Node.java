package ar.fiuba.tdd.tp0;

public class Node<T> {
    private T data;

    private Node<T> next;

    public Node() {
        this.next = new NodeNull<T>();
    }

    public Node(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
