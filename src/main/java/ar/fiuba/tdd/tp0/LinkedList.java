package ar.fiuba.tdd.tp0;

public class LinkedList<T> {
    private Node<T> head;

    public LinkedList(){
        this.head = new NodeNull<T>();
    }

    public void add(T data){
        addLast(head, head.getNext(), data);
    }

    public T first() { return this.head.getData(); }

    private void addLast(Node<T> node, Node<T> nodeNext, T data){
        addLast(nodeNext, nodeNext.getNext(), data);
    }

    private void addLast(NodeNull node, Node<T> nodeNext, T data){
        head = new Node<T>(data);
    }

    private void addLast(Node<T> node, NodeNull nodeNext, T data){
        node.setNext(new Node<T>(data));
    }

}
