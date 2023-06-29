package ApnaCollage.com.io.basic;

import java.util.Scanner;

public class ArrayInput2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];   //size number no array creat thashe

        //input
        for(int i = 0; i < size; i ++) {
            number [i] = sc.nextInt();   //array ni index ma i ni value jama thashe
        }
        
        //output
        for(int i = 0; i < size; i ++) {
            System.out.println(number[i]); //number name no array index print karshe 
        }
    }
    
}
