package tasks;

import java.util.Random;
import java.util.Scanner;
//todo Java doc
/**
 * Created by zOpa
 */
public class Second {

    public static void main(String[] args) {

        Second s = new Second();
        s.createArr();

    }
//todo english JavaDoc

    /**
     * vod razmera arr s klavi, zapolnyaet mass random
     *
     * @return
     */
    private int createArr() {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int a = sc.nextInt();
        int[][] arr = new int[a][a];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt();
            }
        }
        return sumDiagonal(arr);
    }

    /**
     * summa diogonal
     *
     * @param arr
     * @return
     */
    public int sumDiagonal(int arr[][]) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][i];
        }

        return sum;
    }
}
