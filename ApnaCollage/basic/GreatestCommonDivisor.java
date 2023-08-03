package ApnaCollage.basic;

import java.util.*;
 
public class GreatestCommonDivisor {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
       int n1 = sc.nextInt();
        System.out.println("Enter second number:");
       int n2 = sc.nextInt();


      /* while(n1 != n2) {
           if(n1>n2) {3
               n1 = n1 - n2;
            } else {
               n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : "+ n2);*/
        System.out.println("GCD is : "+ gcd(n1,n2));
    }

    private static int gcd(int n1, int n2) {
       int i = n1%n2;
       while (i!=0){

           n1 = n2;
           n2 = i;
           i= n1%n2;
       }
       return n2;
    }
}