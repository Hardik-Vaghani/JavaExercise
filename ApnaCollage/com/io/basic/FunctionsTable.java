package ApnaCollage.com.io.basic;

import java.util.Scanner;

public class FunctionsTable{

    public static int table(int n) {
        int sum=1;
        for(int i=1;i<=10;i++){
            sum=n*i;

            print(sum);//call new function// //yaha par pn print thay che//
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        table(n);
    }
    public static void print(int sum){
        System.out.println(sum);
    }
}