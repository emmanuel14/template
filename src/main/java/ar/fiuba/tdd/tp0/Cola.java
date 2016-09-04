package ar.fiuba.tdd.tp0;

public class Cola<T> implements Queue<T> {

    private LinkedList<T> listaEnlazada;

    public Cola() {
        this.listaEnlazada = new LinkedList<T>();
    }

    public boolean isEmpty() {
        return this.listaEnlazada.isEmpty();
    }

    public int size() {
        return this.listaEnlazada.size();
    }

    public void add(T item) {
        this.listaEnlazada.add(item);
    }

    public T top() {
        if (this.isEmpty()) {
            throw new AssertionError();
        } else {
            return this.listaEnlazada.getFirst();
        }
    }

    public void remove() {
        if (this.isEmpty()) {
            throw new AssertionError();
        } else {
            this.listaEnlazada.removeFirst();
        }
    }
}
