package codewars.com.micky.estructuras.cola;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class ColaLinkedTest {
    private ColaLinked<String> colaList;

    /**
     * Before.
     */
    @Before
    public void instance() {
        colaList = new ColaLinked<>();
    }

    /**
     * test.
     */
    @Test
    public void test1() {
        colaList.push("hola");
        colaList.push("loko");
        colaList.push("bola");
        colaList.push("loka");
        colaList.push("foca");
        colaList.push("foco");
        assertEquals("hola", colaList.front());
        colaList.pop();
        assertEquals("loko", colaList.front());
        colaList.pop();
        colaList.pop();
        assertEquals(3, colaList.tamano());
    }

    /**
     * test2.
     */
    @Test
    public void test2() {
        assertEquals(0, colaList.tamano());
        colaList.pop();
        colaList.push("hola");
        assertEquals("hola", colaList.front());
        colaList.pop();
        assertEquals(0, colaList.tamano());
    }
}
