package ApnaCollage.com.io.basic;

import java.util.Scanner;

public class Factorial {

    public static void printFactorial(int n) {
        //looo
        if(n<0) {
            System.out.println("Invalid number");
            return;
        }
        int Factorial=1;   //factorial =0 nathi levanu ,kem k badhi value 0 thay jashe
        
        for(int i = n; i >= 1; i--) {
            Factorial = Factorial*i;//factorial=facorial=1;*i=5;*i=4;*i=3;*i=2;*i=1;==120//
        }
        System.out.println(Factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
    }
    
}
