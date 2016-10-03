import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by zOpa
 */
public class Thimbles {
    public static void main(String[] args) throws IOException {
        Thimbles th  = new Thimbles();
        th.run();
    }

    private void run() throws IOException {

        int arr[] = {1,0,0}; //todo

        Scanner sc = new Scanner(new File("inputThimbles.txt"));

        char[] chars = sc.next().toCharArray();

        for (int i = 0;  i  < chars.length; i++){
          menyaem(arr,chars[i]);
        }

        for (int i = 0;  i  < arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    private int [] menyaem(int arr [], char ch ){

        if (ch == 'A'){
            changeElement(arr,0,1);
        }
        if (ch == 'B'){
            changeElement(arr,1,2);
        }
        if (ch == 'C'){
            changeElement(arr,0,2);
        }

        return arr;
    }

    private int [] changeElement (int arr [], int a, int b){

       int tmp =  arr[a];
        arr[a] = arr [b];
        arr [b] = tmp;

        return arr;
    }
}