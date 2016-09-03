package ar.fiuba.tdd.tp0;

public class Cola<T> implements Queue<T> {

    private LinkedList<T> listaEnlazada;

    public Cola() {
        this.listaEnlazada = new LinkedList<T>();
    }

    public boolean isEmpty() {
        return this.listaEnlazada.IsEmpty();
    }

    public int size() {
        return this.listaEnlazada.Size();
    }

    public void add(T item) {
        this.listaEnlazada.Add(item);
    }

    public T top() {
        return this.listaEnlazada.GetFirst();
    }

    public void remove() {
        this.listaEnlazada.RemoveFirst();
    }
}
