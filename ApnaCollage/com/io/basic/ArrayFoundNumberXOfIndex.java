package ApnaCollage.com.io.basic;

import java.util.Scanner;

public class ArrayFoundNumberXOfIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];

        //input
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        //output
        for(int i=0;i<number.length;i++){
            if(number[i]==x){
                System.out.println("X fuond at index : "+i);
            }
        }
    }
    
}
