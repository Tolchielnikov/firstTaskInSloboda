package tasks;
//todo JavaDoc

import tasks.forTests.IndexElement;

/**
 * Created by zOpa
 */
public class First {

    public int[] sortingArr(int arr[]) {

        if (arr==null){
            throw new IllegalArgumentException("null" ); //todo mess.
        }

        IndexElement inEl = new IndexElement();

        for (int i = Math.max(inEl.maxElementIndex(arr), inEl.minElementIndex(arr)); i > Math.min(inEl.maxElementIndex(arr), inEl.minElementIndex(arr)); i--) {
            for (int j = Math.min(inEl.maxElementIndex(arr), inEl.minElementIndex(arr)); j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
