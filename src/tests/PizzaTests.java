package tests;

import org.junit.Test;
import tasks.Pizza;

import java.util.Random;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

/**
 * Created by zOpa
 */
public class PizzaTests {
    static Pizza pizza = new Pizza();
    Random random = new Random();

    @Test
    public void testPizza() {
        test(1, 0);
        test(2, 1);
        test(4, 2);
        test(7, 3);
        test(11, 4);
    }

    //tests to exception
    @Test
    public void testExceptionPizza() {
        // negative
        testToException(-1);
        testToException(-10);
        testToException(-100);
        testToException(-1000);
        testToException(-10000);
        testToException(-100000);
        testToException(Integer.MIN_VALUE);
        testToException(-random.nextInt(Integer.MAX_VALUE));

        // big
        testToException(46341);
        testToException(463410);
        testToException(4634101);
        testToException(46341012);
        testToException(463410123);
        testToException(Integer.MAX_VALUE);
        testToException(random.nextInt(Integer.MAX_VALUE - 46341) + 46341);
    }

    private static void testToException(int n) {
        try {
            pizza.pieces(n);
            fail();
        } catch (IllegalArgumentException iae) {
            //correct
        }
    }

    private static void test(int output, int n) {
        assertEquals(output, pizza.pieces(n));
    }
}
