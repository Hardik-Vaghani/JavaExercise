package ApnaCollage.com.io.basic;

import java.util.Scanner;

public class OddNumberPrint {

    public static void main(String[] args) {
        int sum=0;
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<=n;i++){        
            if((i % 2) == 1){            //if((i%2) == 1){
                sum += i;            // sum += i;
            }
        }
        System.out.println(sum);
    } 
}

 
// import java.util.*;
 
// public class com.io.basic.OddNumberPrint {
//     public static void main(String args[]) {
//         int N, i, sum = 0;
 
//         Scanner in = new Scanner(System.in);
//         // System.out.println("Enter a number");
//         N = in.nextInt();
 
//         for(i = 0; i <= N; i++){
//             if((i%2) == 1){
//                 sum += i;
//             }
//         }
     
//         System.out.print("Sum of all odd numbers between 0 to "+ N + " = " + sum);
//     }
// }