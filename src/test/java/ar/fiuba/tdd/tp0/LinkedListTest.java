package ar.fiuba.tdd.tp0;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void AddUnitTest() {
        LinkedList<String> listaEnlazada = new LinkedList<String>();

        listaEnlazada.add("emma");

        listaEnlazada.add("nuel");

        assertEquals(listaEnlazada.first(), "emma");
    }
}
