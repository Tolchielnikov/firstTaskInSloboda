package tasks.forTests;

import java.util.Random;
//todo JavaDoc
/**
 * Created by zOpa
 */
    public class FillArray {

    public int[][] createArray(int... args){

        Random random = new Random();
        int arr[][] = new int[args.length][args.length];
        int k = 0;

        for (int i =0; i < args.length; i++){
            for(int j = 0; j < args.length; j++){
                if(i == j){
                 arr[i][j] = args[k];
                    k++;
                }else {
                    arr[i][j] = random.nextInt();
                }
            }
        }
        return arr;
    }
}
