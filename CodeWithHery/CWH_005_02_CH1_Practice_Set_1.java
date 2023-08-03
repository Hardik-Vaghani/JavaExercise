package CodeWithHery;
import java.util.Scanner;

public class CWH_005_02_CH1_Practice_Set_1 {
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
/*
1) What will be the result of the following expression:
float a = 7/4 * 9/2

2) Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.

3) Use comparison operators to find out whether a given number is greater than the user entered number or not.

4) Write the following expression in a java program:
(v^2-u^2)/2as

5) Find the value of 'a' in expression given below :
int x = 7
int a = 7*49/7 + 35/7

*) Code Solution:
package com.company;

public class cwh_12_ps2_pr01 {
    public static void main(String[] args) {
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);
    }
}


package com.company;

public class cwh_12_ps2_pr02 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}


package com.company;
import java.util.Scanner;

public class cwh_12_ps2_pr_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>8);
        System.out.println(7*49/7+35/7);
    }
}
 */