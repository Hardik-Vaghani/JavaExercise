package ApnaCollage.com.io.basic;

import java.util.Scanner;

public class SumOdd {

    public static void printSum(int n) {
        int sum = 0;
  
       for(int i=1; i<=n; i++) {
         if(i % 2 != 0) {    //(i % 2 !=1)"deki snakhya aveche"
             sum = sum + i;
         }
       }
  
       System.out.println(sum);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       printSum(n);
    }   
 
}
