package CodeWithHery;
import java.util.Scanner;
//import java.util.*;
public class CWH_065_01_Creating_Packages_in_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("This is my scanner taking input as " + a);
    }
}
/*
How to create a package in Java :
        javac -d Harry java

The above code creates a packages folder.
        java Harry java

The above code creates Harry class.

   *)  We can also create inner packages by adding packages inner as the package name.
   *)  These packages once created can be used by other classes.

 */