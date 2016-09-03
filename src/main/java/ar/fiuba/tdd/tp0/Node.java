package ar.fiuba.tdd.tp0;

class Node<T> {
    private T data;

    private Node<T> next = null;

    public Node(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> node) {
        this.next = node;
    }

    public T getData() {
        return this.data;
    }
}
