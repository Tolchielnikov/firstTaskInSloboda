package tasks;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
//todo create JavaDoc
/**
 * Created by zOpa
 */
public class Thimbles {
    public static void main(String[] args) throws IOException {
        Thimbles th  = new Thimbles();
        th.run();
    }

    public int run() throws IOException {

        int arr[] = {1,0,0}; //todo
        int numberThimble = 0;

        Scanner sc = new Scanner(new File("inputThimbles.txt"));

        char[] chars = sc.next().toUpperCase().toCharArray();

        for (int i = 0;  i  < chars.length; i++){
          menyaem(arr,chars[i]);
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1){
               numberThimble = i;
            }
        }
        return numberThimble + 1;
    }

    private int [] menyaem(int arr [], char ch ){  //todo method name

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