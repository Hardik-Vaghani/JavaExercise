package ApnaCollage.basic;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number when you count : ");
        long n = sc.nextInt();
       
        long a = 0, b = 1;
           
        System.out.print(a+" ");
       
        if(n > 1) {
            //find nth term
            for(int i=2; i<=n; i++) {
                System.out.print(b+" ");
                //the concept below is called swapping
                long temp = b;
                b = a + b;
                a = temp;
            }
  
            System.out.println();
        }
    } 
 
    
}
