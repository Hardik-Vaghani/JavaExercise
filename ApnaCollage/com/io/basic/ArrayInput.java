package ApnaCollage.com.io.basic;

import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//object
        int size = sc.nextInt();
        int number[]=new int[size];         //object

        //input
        for(int i=0;i<size;i++){
            number[i] = sc.nextInt(); 
        }
        //output
        for(int i=0;i<size;i++){
            System.out.println(number[i]);
        }
    }
    
}
