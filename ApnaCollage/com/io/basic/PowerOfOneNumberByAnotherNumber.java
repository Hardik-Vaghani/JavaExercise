package ApnaCollage.com.io.basic;

import java.util.*;
 
public class PowerOfOneNumberByAnotherNumber {

   public static void main(String[] args) {
       System.out.println("Enter x");
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       System.out.println("Enter power n");
       int n = sc.nextInt();
 
       int result = 1;
       //Please see that n is not too large or else result will exceed the size of int
       for(int i=0; i<n; i++) {
           result = result * x;
       }

       System.out.println("x to the power n is : "+ result);
    }   
}
