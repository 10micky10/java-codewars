package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Test.
 */
public class LogicOperationsTest {

    /**
    * Test.
    */
    @Test
    public void testAnd() {
        assertTrue(LogicOperations.getAnd(1, 1));
        assertFalse(LogicOperations.getAnd(0, 1));
        assertFalse(LogicOperations.getAnd(1, 0));
        assertFalse(LogicOperations.getAnd(0, 0));
    }

    /**
    * Test.
    */
    @Test
    public void testOr() {
        assertFalse(LogicOperations.getOr(0, 0));
        assertTrue(LogicOperations.getOr(0, 1));
        assertTrue(LogicOperations.getOr(1, 0));
        assertTrue(LogicOperations.getOr(1, 1));
    }

    /**
    * Test.
    */
    @Test
    public void testNAr() {
        assertTrue(LogicOperations.getNAnd(0, 0));
        assertTrue(LogicOperations.getNAnd(0, 1));
        assertTrue(LogicOperations.getNAnd(1, 0));
        assertFalse(LogicOperations.getNAnd(1, 1));
    }

    /**
    * Test.
    */
    @Test
    public void testNOr() {
        assertTrue(LogicOperations.getNOr(0, 0));
        assertFalse(LogicOperations.getNOr(0, 1));
        assertFalse(LogicOperations.getNOr(1, 0));
        assertFalse(LogicOperations.getNOr(1, 1));
    }
}
