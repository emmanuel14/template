package ar.fiuba.tdd.tp0;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> last;

    public LinkedList() {
        this.head = null;
    }

    public void add(T data) {
        Node<T> node = new Node<T>(data);

        if (this.head == null) {
            this.head = node;
        } else {
            last.setNext(node);
        }

        this.last = node;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public T getFirst() {
        return this.head.getData();
    }

    public void removeFirst() {
        this.head = this.head.getNext();
    }

    public int size() {
        return count(this.head, 0);
    }

    private int count(Node<T> node, int size) {
        if (node == null) {
            return size;
        } else {
            return count(node.getNext(), ++size);
        }
    }
}
