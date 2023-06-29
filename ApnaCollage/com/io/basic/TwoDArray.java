package ApnaCollage.com.io.basic;// import java.util.Scanner;

// public class com.io.basic.TwoDArray {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int colm = sc.nextInt();

//         int [] [] numbers = new int [row] [colm];
//         //input 
//         for( int i = 0; i < row; i ++) {
//             for( int j = 0; j < colm; j ++) {
//                 numbers [i] [j] = sc.nextInt();
//             }
//         }
//         //output
//         for( int i = 0; i < row; i ++) {
//             for( int j = 0; j < colm; j ++) {
//                 System.out.print(numbers [i] [j] + " ");
//             }
//             System.out.println();
//         }
//     }
    
// }
import java.util.*;
 
public class TwoDArray {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int cols = sc.nextInt();
 
       int numbers[][] = new int[rows][cols];
 
       
       //input
       //rows
       for(int i=0; i<rows; i++) {
           //columns
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
            }
        }
        //output
       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
