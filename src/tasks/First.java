package tasks;
//todo JavaDoc
/**
 * Created by zOpa
 */
public class First {

    public int[] sortingArr(int arr[]) {

        if (arr==null){
            throw new IllegalArgumentException("null" ); //todo mess.
        }

        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }

            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }

        for (int i = Math.max(maxIndex, minIndex); i > Math.min(maxIndex, minIndex); i--) {
            for (int j = Math.min(maxIndex, minIndex); j < i; j++) {
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
