package ApnaCollage.basic;

import java.util.Scanner;

public class HomeWorkRadius {
    public static int radius(int n){
        return n*2;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        radius(n);
        System.out.println(radius(n));
    }
}
