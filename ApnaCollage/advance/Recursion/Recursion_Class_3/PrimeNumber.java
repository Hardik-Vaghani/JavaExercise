package ApnaCollage.advance.Recursion.Recursion_Class_3;

import java.util.Scanner;

public class PrimeNumber {
    public static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        checkPrimeNumber(n);
        System.out.println("Total count is prime number : "+count);
    }

    private static void checkPrimeNumber( int n) {
        if (n == 0) {//base case
            return;
        }

        if (!(n % 2 == 0)) {
            System.out.println(n+",");
            count = count+1;
        }
        n--;
        checkPrimeNumber(n);//recursion calling
    }
}
