package CodeWithHery;
import java.util.Scanner;

public class CWH_012_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number \nCompare to 8 ,the number is grater : true, thenumbe is lasser : false");
        int a = sc.nextInt();
        System.out.println(a>8);
    }
}
