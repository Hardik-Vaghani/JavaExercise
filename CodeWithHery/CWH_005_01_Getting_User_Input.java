package CodeWithHery;
import java.util.Scanner;
public class CWH_005_01_Getting_User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int a = sc.nextInt();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        int sum = a + b ;
//        System.out.println("number 1  or  number 2 sum is : " + sum );
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
        boolean str = sc.hasNextLine() ; //_-> sc.ne
        System.out.println(str);
    }
}
