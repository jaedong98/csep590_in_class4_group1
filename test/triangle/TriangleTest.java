package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class TriangleTest {

    @Test
    public void test1() {
        new Triangle();
        assertEquals(triangle.Triangle.classify(0,1,1), INVALID);
    }

    @Test
    public void test2() {
        assertEquals(triangle.Triangle.classify(1,1,1), EQUILATERAL);
    }

    @Test
    public void test3() {
        assertEquals(triangle.Triangle.classify(1,2,3), INVALID);
    }

    @Test
    public void test4() {
        assertEquals(triangle.Triangle.classify(2,3,4), SCALENE);
    }

    @Test
    public void test5() {
        assertEquals(triangle.Triangle.classify(2,2,1), ISOSCELES);
    }

    @Test
    public void test6() {
        assertEquals(triangle.Triangle.classify(2,1,2), ISOSCELES);
    }

    @Test
    public void test7() {
        assertEquals(triangle.Triangle.classify(1,2,2), ISOSCELES);
    }

    @Test
    public void test8() {
        assertEquals(triangle.Triangle.classify(2,2,5), INVALID);
    }

    @Test
    public void test9() {
        assertEquals(triangle.Triangle.classify(1,0,1), INVALID);
    }

    @Test
    public void test10() {
        assertEquals(triangle.Triangle.classify(1,1,0), INVALID);
    }

    @Test
    public void test11() {
        assertEquals(triangle.Triangle.classify(2,5,2), INVALID);
    }

    @Test
    public void test12() {
        assertEquals(triangle.Triangle.classify(5,2,2), INVALID);
    }

    @Test
    public void test13() {
        assertEquals(triangle.Triangle.classify(2,3,1), INVALID);
    }

    @Test
    public void test14() {
        assertEquals(triangle.Triangle.classify(3,2,1), INVALID);
    }

    @Test
    public void test15() {
        assertEquals(triangle.Triangle.classify(2,3,5), INVALID);
    }

    @Test
    public void test16() {
        assertEquals(triangle.Triangle.classify(2,5,3), INVALID);
    }

    @Test
    public void test17() {
        assertEquals(triangle.Triangle.classify(5,2,3), INVALID);
    }

    @Test
    public void test18() {
        assertEquals(triangle.Triangle.classify(2,2,4), INVALID);
    }

    @Test
    public void test19() {
        assertEquals(triangle.Triangle.classify(2,1,1), INVALID);
    }

    @Test
    public void test20() {
        assertEquals(triangle.Triangle.classify(1,2,1), INVALID);
    }

    @Test
    public void test21() {
        assertEquals(triangle.Triangle.classify(-1,-1,-1), INVALID);
    }

    @Test
    public void test22() {
        assertEquals(triangle.Triangle.classify(1,1,-1), INVALID);
    }

    @Test
    public void test23() {
        assertEquals(triangle.Triangle.classify(-1,1,1), INVALID);
    }

    @Test
    public void test24() {
        assertEquals(triangle.Triangle.classify(1,-1,1), INVALID);
    }

    @Test
    public void test25() {
        assertEquals(triangle.Triangle.classify(1,2,4), INVALID);
    }

    @Test
    public void test26() {
        assertEquals(triangle.Triangle.classify(4,2,1), INVALID);
    }

    @Test
    public void test27() {
        assertEquals(triangle.Triangle.classify(1,4,2), INVALID);
    }

    @Test
    public void test28() {
        assertEquals(triangle.Triangle.classify(1,1,2), INVALID);
    }
}
