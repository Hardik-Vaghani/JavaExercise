package ApnaCollage.basic;

import java.util.Scanner;

public class NWhithForLoop {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        
        // int sum = 0;
        // for(int i=0;i<=n;i++){   //i=1 + i=2 + i=3 + i=4 + i=5 = (i=15)//
        //     sum = sum+i;
        // }
        // System.out.println(sum);
        for(int i=1;i<=10;i++){    // i=1 * n,i=2 * n,  i=3 * n, i=4 * n, i=5 * n, i=6 * n, i=7 *  n,i=8 * n, i=9 * n, i=10 * n,
            System.out.println(i*n);
        }
    }
}
    
