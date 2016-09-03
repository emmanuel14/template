package ar.fiuba.tdd.tp0;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> last;

    public LinkedList() {
        this.head = null;
    }

    public void Add(T data) {
        Node<T> node = new Node<T>(data);

        if (this.head == null) {
            this.head = node;
        } else {
            last.SetNext(node);
        }

        this.last = node;
    }

    public boolean IsEmpty() {
        return this.head == null;
    }

    public T GetFirst() {
        return this.head.GetData();
    }

    public void RemoveFirst() {
        this.head = this.head.GetNext();
    }

    public int Size() {
        return Count(this.head, 0);
    }

    private int Count(Node<T> node, int size) {
        if (node == null)
            return size;
        else
            return Count(node.GetNext(), ++size);
    }
}
