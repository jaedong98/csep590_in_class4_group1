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
        triangle.Triangle.classify(0,1,1);
    }

    @Test
    public void test2() {
        triangle.Triangle.classify(1,1,1);
    }

    @Test
    public void test3() {
        triangle.Triangle.classify(1,2,3);
    }

    @Test
    public void test4() {
        triangle.Triangle.classify(2,3,4);
    }

    @Test
    public void test5() {
        triangle.Triangle.classify(2,2,1);
    }

    @Test
    public void test6() {
        triangle.Triangle.classify(2,1,2);
    }

    @Test
    public void test7() {
        triangle.Triangle.classify(1,2,2);
    }

    @Test
    public void test8() {
        triangle.Triangle.classify(2,2,5);
    }

    @Test
    public void test9() {
        triangle.Triangle.classify(1,0,1);
    }

    @Test
    public void test10() {
        triangle.Triangle.classify(1,1,0);
    }

    @Test
    public void test11() {
        triangle.Triangle.classify(2,5,2);
    }

    @Test
    public void test12() {
        triangle.Triangle.classify(5,2,2);
    }

    @Test
    public void test13() {
        triangle.Triangle.classify(2,3,1);
    }

    @Test
    public void test14() {
        triangle.Triangle.classify(3,2,1);
    }

    @Test
    public void test15() {
        triangle.Triangle.classify(2,3,5);
    }

    @Test
    public void test16() {
        triangle.Triangle.classify(2,5,3);
    }

    @Test
    public void test17() {
        triangle.Triangle.classify(5,2,3);
    }

    @Test
    public void test18() {
        triangle.Triangle.classify(2,2,4);
    }

    @Test
    public void test19() {
        triangle.Triangle.classify(2,1,1);
    }

    @Test
    public void test20() {
        triangle.Triangle.classify(1,2,1);
    }

    @Test
    public void test21() {
        triangle.Triangle.classify(-1,-1,-1);
    }

    @Test
    public void test22() {
        triangle.Triangle.classify(1,1,-1);
    }

    @Test
    public void test23() {
        triangle.Triangle.classify(-1,1,1);
    }

    @Test
    public void test24() {
        triangle.Triangle.classify(1,-1,1);
    }

    @Test
    public void test25() {
        triangle.Triangle.classify(1,2,4);
    }

    @Test
    public void test26() {
        triangle.Triangle.classify(4,2,1);
    }

    @Test
    public void test27() {
        triangle.Triangle.classify(1,4,2);
    }

    @Test
    public void test28() {
        triangle.Triangle.classify(1,1,2);
    }
}
