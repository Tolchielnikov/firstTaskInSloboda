package tests;

import org.junit.Test;
import tasks.First;

import static junit.framework.TestCase.fail;

/**
 * Created by zOpa
 */
public class FirstTest {
    static First first = new First();

    @Test
    public void testFirst (){
        //todo simplify
        test(0,1,new int[]{0,90});
        test(0,2,new int[]{0,90,100});
        test(0,9,new int[]{0,3,2,3,4,5,1,3,5,90});
        test(2,9,new int[]{6,3,1,3,4,5,1,3,5,90,4});
        test(0,10,new int[]{Integer.MIN_VALUE,3,1,3,4,5,1,3,5,90,Integer.MAX_VALUE});
        //todo mo test
    }

    @Test
    public void testFirstToExp(){
        testToException(null);
        //todo mo tests
    }

    private static void test(int a, int b, int arr[]) {
        //todo write finding min and max

        for (int i = a; i < b; i++){
            if (first.sortingArr(arr)[i] > first.sortingArr(arr)[i+1]){
                fail();
            }
        }
    }

    private static void testToException(int arr[]) {
        try {
            first.sortingArr(arr);
            fail();
        } catch (IllegalArgumentException iae) {
            //correct
        }
    }
}
