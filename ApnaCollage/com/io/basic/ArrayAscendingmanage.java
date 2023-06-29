package ApnaCollage.com.io.basic;

import java.util.Scanner;

public class ArrayAscendingmanage {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int R [] = new int[n];

        for(int i = 0; i < n; i ++) {
            R [ i ] = sc.nextInt();
        }
        for(int i = 0; i < n; i ++) {
            for(int j = i+1; j < n; j ++) {

                if( R [ i ] < R [ j ] ) {     // chenge < , >  

                   int temp = R [ i ];
                    R [ i ] = R [ j ];
                   R [ j ] = temp;

                }
            }
        }
        for(int i = 0; i < n; i ++) {
            System.out.print(R [ i ] + " ");
        }
    }
}
