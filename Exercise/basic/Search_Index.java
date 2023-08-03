package Exercise.basic;

import java.util.Scanner;

public class Search_Index {
    public static void main(String[] args) {
        char[] z = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt()-1;
        System.out.println(z[num]);
       // System.out.println(z[sc.nextInt()]);

    }   
}
