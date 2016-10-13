package tests.forTests;

import org.junit.Test;
import tasks.forTests.IndexElement;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by zOpa
 */
public class IndexElementTest {
   static IndexElement inEl  = new IndexElement();

    @Test
    public void IndexElTest(){
        // index max element in array
        testMax(1,new int []{1,100,2,4,1});
        testMax(2,new int []{1,100,1022,4,1});
        testMax(0,new int []{16,2,2,10,12,4,1});
        testMax(6,new int []{16,2,2,10,12,4,18});

        // index min element in array
        testMin(0,new int []{1,100,2,4,1});
        testMin(0,new int []{1,100,2,4,3});
        testMin(1,new int []{1,0,2,4,1});
        testMin(2,new int []{1,2,0,4,1});
        testMin(3,new int []{1,3,4,0});
    }

    static public void testMin (int indexMinEl, int arr[]){
        assertEquals(indexMinEl, inEl.minElementIndex(arr));
    }

    static public void testMax (int indexMaxEl, int arr[]){
        assertEquals(indexMaxEl,inEl.maxElementIndex(arr));
    }
}
