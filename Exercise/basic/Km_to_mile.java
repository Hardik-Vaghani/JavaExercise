package Exercise.basic;

import java.util.Scanner;
public class Km_to_mile {
    public static void main(String[] args) {
        double km;
        System.out.println("Enter Kilometer");
        Scanner sc = new Scanner(System.in);
        km = sc.nextDouble();
        double mile = km/1.60934;
        System.out.println("mile is : "+ mile);

        
        // double mile;
        // System.out.println("Enter mile");
        // Scanner sc = new Scanner(System.in);
        // mile = sc.nextDouble();
        // double km = mile*1.60934;
        // System.out.println("kilometer is : "+ km);
    }
}