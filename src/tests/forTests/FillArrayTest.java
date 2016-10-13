package tests.forTests;

import tasks.forTests.FillArray;
import org.junit.Test;

import static junit.framework.TestCase.fail;

/**
 * Created by zOpa
 */
public class FillArrayTest {
   static FillArray fillArray = new FillArray();

    @Test
    public void testFillArray(){

        test();
        test(1);
        test(1,2);
        test(1,2,3);
        test(1,2,4,5);
        test(1,2,6,7,8);
        test(1,2,6,7,8,9);
        test(1,2,6,7,8,9,10);
        test(1,2,6,7,8,9,10,11);
        test(1,2,6,7,8,9,10,11,12);
    }

    static private void test (int... args){

        for (int i = 0; i < args.length; i++){
            if (args[i] != fillArray.createArray(args)[i][i]){
                fail();
            }
        }

    }
}
