package CodeItUp.Input;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        System.out.println("Number is:\t"+s.nextInt());
    }
}
