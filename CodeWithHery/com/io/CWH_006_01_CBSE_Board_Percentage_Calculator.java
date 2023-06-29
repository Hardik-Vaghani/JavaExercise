package CodeWithHery.com.io;
import java.util.Scanner;

public class CWH_006_01_CBSE_Board_Percentage_Calculator {
    public static void main(String[] args) {
        System.out.println("Entor Your Number Of Subject ");
        Scanner sc = new Scanner(System.in);
        float  a = 100.0f * 6 ;
        System.out.println("Entor Your \"History\" marks : ");
        int  hstr = sc.nextInt();
        System.out.println("Entor Your \"Mathematics\" marks : ");
        int  mth = sc.nextInt();
        System.out.println("Entor Your \"physics\" marks : ");
        int  phy = sc.nextInt();
        System.out.println("Entor Your \"Gujrati\" marks : ");
        int  guj = sc.nextInt();
        System.out.println("Entor Your \"Hindi\" marks : ");
        int  hindi = sc.nextInt();
        System.out.println("Entor Your \"English\" marks : ");
        int  eng = sc.nextInt();

        int  sum = hstr + mth + phy + guj + hindi + eng;

        float prnt1 =  sum/a*100.0f;
        System.out.println("percentage is : "+ prnt1);


    }

}
