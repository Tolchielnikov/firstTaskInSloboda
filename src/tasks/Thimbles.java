package tasks;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
//todo create JavaDoc
/**
 * Created by zOpa
 */
public class Thimbles {

    public int run() throws IOException {

        int thimbles[] = {1,0,0};

        int numberThimble = 0;

        Scanner sc = new Scanner(new File("inputThimbles.txt"));

        if (sc.hasNext()){

        char[] chars = sc.next().toUpperCase().toCharArray();

        for (int i = 0;  i  < chars.length; i++){
          swap(thimbles,chars[i]);
        }

        for (int i = 0; i < thimbles.length; i++){
            if (thimbles[i] == 1){
               numberThimble = i;
            }
          }
        }
        return numberThimble + 1;
    }

    private int [] swap(int arr [], char ch ){

        if (ch == 'A'){
            changeElement(arr,0,1);
        }else if (ch == 'B'){
            changeElement(arr,1,2);
        } else if (ch == 'C'){
            changeElement(arr,0,2);
        } else {
            throw new IllegalArgumentException("Only A B C"); //todo mess.
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