package ar.fiuba.tdd.tp0;

public class Node<T> {
    private T data;

    private Node<T> next = null;

    public Node(T data) {
        this.data = data;
    }

    public Node<T> GetNext() {
        return this.next;
    }

    public void SetNext(Node<T> node) {
        this.next = node;
    }

    public T GetData() {
        return this.data;
    }
}
