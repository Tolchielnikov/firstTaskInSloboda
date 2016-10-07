package tasks;

/**
 * Created by zOpa on 21.09.2016.
 */
public class First {

    public static void main(String[] args) {
        First f = new First();
        int [] arr = {3,92,1,10,2,4,34,68,8};
        int [] newArr = f.sortingArr(arr);
        for (int i =0 ; i < arr.length;i++){
        System.out.print(newArr[i]+" ");}
    }

    public int[] sortingArr(int arr[]) {

        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
                System.out.println("max = " + maxIndex);
            }

            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
                System.out.println("min = " + minIndex);
                }
            }

        for (int i = Math.max(maxIndex,minIndex); i > Math.min(maxIndex,minIndex); i--){
            for(int j = Math.min(maxIndex,minIndex); j < i; j++ ){
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
            return arr;
        }
}
