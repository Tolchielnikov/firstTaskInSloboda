package tests.tasks;

import org.junit.Test;
import tasks.First;
import tasks.forTests.IndexElement;

import java.util.Random;

import static junit.framework.TestCase.fail;

/**
 * Created by zOpa
 */
public class FirstTest {
    static IndexElement inEl = new IndexElement();
    static First first = new First();
           Random r = new Random();


    @Test
    public void testFirst (){
        test(0,90);
        test(0,90,100);
        test(0,900,100);
        test(-345,900,100);
        test(-345,-900,-100);
        test(-345,-9000,23100);
        test(-34125,-9000,23100);
        test(0,3,2,3,4,5,1,3,5,90);
        test(6,3,1,3,4,5,1,3,5,90,4);
        test(0,3,2,3,4,5,1,3,5,90,12);
        test(1,0,3,2,3,4,5,1,3,5,90,12);
        test(0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        test(0,0,0,0,0,0,0,0,0,0,0,0,0,0,1);
        test(-1,-2,0,0,0,0,0,0,0,0,0,0,0,0,1);
        test(-135,0,0,0,0,0,0,0,0,0,0,0,0,0,135);
        test(-135,r.nextInt(),0,0,0,0,0,0,0,0,r.nextInt(),0,0,0,135);
        test(Integer.MIN_VALUE,3,1,3,4,r.nextInt(),1,3,5,90,Integer.MAX_VALUE);
        test(r.nextInt(),r.nextInt(),r.nextInt(),r.nextInt(),r.nextInt(),r.nextInt());
    }

    @Test
    public void testFirstToExp(){
        testToException(null);
        //todo mo tests
    }

    static private void test(int... args) {

        int arr[] = new int[args.length];
        int j = 0;

        for(int x : args){
            arr[j] = x;
            j++;
        }

        for (int i = inEl.minElementIndex(arr); i < inEl.maxElementIndex(arr); i++){
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
