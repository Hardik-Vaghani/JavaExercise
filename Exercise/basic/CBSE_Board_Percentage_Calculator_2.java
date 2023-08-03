package Exercise.basic;

import java.util.Scanner;

class Subject{
    int max = 100;
    int abtd;
}
public class CBSE_Board_Percentage_Calculator_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mathematics marks");
        Subject s1 = new Subject();
        s1.abtd = sc.nextInt();

        System.out.println("History marks");
        Subject s2 = new Subject();
        s2.abtd = sc.nextInt();

        System.out.println("physics marks");
        Subject s3 = new Subject();
        s3.abtd = sc.nextInt();

        int tabtd = s1.abtd + s2.abtd + s3.abtd ;
        float per = tabtd*100/300f;
        System.out.println(per);
    }
}