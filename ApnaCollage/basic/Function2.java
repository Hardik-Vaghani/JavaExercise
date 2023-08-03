package ApnaCollage.basic;

import java.util.Scanner;

public class Function2 {
    


    public static int calculateSum(int a,int b){
        int sum = a+b;//with out variable na sum pn hay
        return sum; //"return a+b;"
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        //system.out.println("    "+ calculateSum);
        int sum = calculateSum(a, b);
        System.out.println("sum of 2 number is "+sum);
        
        
    }
    
}

