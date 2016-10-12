package tasks;
//todo JavaDoc
/**
 * Created by zOpa
 */
public class IndexElement {

    public int minElementIndex (int arr[]){
        int min = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public int maxElementIndex (int arr[]){
        int max = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
