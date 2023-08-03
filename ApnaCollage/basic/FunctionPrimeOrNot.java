package ApnaCollage.basic;

import java.util.Scanner;

public class FunctionPrimeOrNot {

    public static void primeOrNot(int n,int m) {
        // if(n%2==0){
        //     System.out.println("is a prime number");
        // }else{
        //     System.out.println("is a not prime number");
        // }
        if(n>m){
            System.out.println("number is prime");
        }else{
            System.out.println("number is lesser than");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        primeOrNot(n,m);
    }
    
}
