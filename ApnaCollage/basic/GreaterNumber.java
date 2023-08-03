package ApnaCollage.basic;

import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        if(n<m){
            System.out.println(m);
        }else{
            System.out.println(n);
        }
    }
    
}