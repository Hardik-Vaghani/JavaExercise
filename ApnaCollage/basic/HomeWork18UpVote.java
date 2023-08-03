package ApnaCollage.basic;

import java.util.Scanner;

public class HomeWork18UpVote {
    public static void voting(int age){
        if(age>=18){
            System.out.println("that person is eligible");
        }else{
            System.out.println("that person is not eligible");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();

        voting(age);
    }
    
}
