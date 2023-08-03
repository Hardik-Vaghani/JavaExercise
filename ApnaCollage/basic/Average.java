package ApnaCollage.basic;

import java.util.Scanner;

public class Average {

    public static int sumPrint(int n,int m,int k) {
       
        int sum=n+m+k;    
        int l=sum/3;
        return l ; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();


        int l = sumPrint(n,m,k); 

        System.out.println(l);
    }
    
}
