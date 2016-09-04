package ar.fiuba.tdd.tp0;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ColaTest {

    Queue<String> cola;

    @Before
    public void setUp() throws Exception {
        cola = new Cola<String>();

        cola.add("primero");
        cola.add("segundo");
        cola.add("tercero");
    }

    @Test
    public void isEmpty() throws Exception {
        Assert.assertFalse(cola.isEmpty());
    }

    @Test
    public void size() throws Exception {
        Assert.assertEquals(3, cola.size());
    }

    @Test
    public void top() throws Exception {
        Assert.assertEquals("primero", cola.top());
    }

    @Test
    public void remove() throws Exception {
        cola.remove();
        Assert.assertEquals("segundo", cola.top());
    }

    @Test(expected = AssertionError.class)
    public void topAssertionError() {
        cola.remove();
        cola.remove();
        cola.remove();
        cola.top();
    }

    @Test(expected = AssertionError.class)
    public void removeAssertionError() {
        cola.remove();
        cola.remove();
        cola.remove();
        cola.remove();
    }

}