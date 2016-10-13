package tests.tasks;

import tasks.forTests.FillArray;
import org.junit.Test;
import tasks.Second;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by zOpa on 13.10.2016.
 */
public class SecondTest {
   static private FillArray fillArray = new FillArray();
   static private Second second = new Second();

    @Test
    public void testSecond(){
        // test, first number - sum of the diagonal, other diagonal
        test(1,1);
        test(1,0,1);
        test(10,1,9,0);
        test(3,1,5,-3);

        test(-1,1,-3,1);
        test(-3,-1,-1,-1);

        test(12,4,4,2,1,1);
        test(48,48);
        test(256,128,128);
        test(12,1,10,-10,2,9);
        test(10,1,1,1,1,1,1,1,1,1,1);
        test(12,1,3,4,1,2,2,-1);
        test(18,1,8,9);
        test(40000,10000,10000,10000,10000);
        test(12,-12,12,-12,12,-12,12,12);
        test(37,7,30);
        test(1,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }

    //todo
    @Test
    public void testToExepSecond(){
        test(37,Integer.MAX_VALUE,Integer.MAX_VALUE);
    }

    static private void test (int sum, int... args){
        assertEquals(sum, second.sumDiagonal(fillArray.createArray(args)));
    }
}
