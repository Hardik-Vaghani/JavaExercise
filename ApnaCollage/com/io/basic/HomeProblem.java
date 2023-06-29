package ApnaCollage.com.io.basic;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class HomeProblem {                               //big number return//
    public static int krishna(int n,int m){
        if(n<m){
            return m;
        }else{
            return n;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        krishna(n, m);

        System.out.println(krishna(n, m));
    }
}
