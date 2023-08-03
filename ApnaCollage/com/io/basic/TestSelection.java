package ApnaCollage.com.io.basic;

import java.lang.reflect.Array;

public class TestSelection {

    public static void print(int[] arr) {
        for( int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 ,0};

        //selection sort
        for( int i = 0; i < arr.length -1; i ++ ) {
            int smallast = i;
            for( int j = i + 1; j < arr.length; j ++) {
                if( arr[smallast] > arr[j]) {
                    smallast = j;
                }
            }
            int temp = arr[smallast];
            arr[smallast] = arr[i];
            arr[i] = temp;
        }
        print( arr);
    }
}
