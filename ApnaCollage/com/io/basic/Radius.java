package ApnaCollage.com.io.basic;

import java.util.Scanner;

public class Radius {

    private static Double radius;
    public static Double getCircumference(Double radius) {
        return 2 * 3.14 * radius;    //2 pai R
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Double radius = sc.nextDouble();

       System.out.println(getCircumference(radius));
    }   
 
    
}
