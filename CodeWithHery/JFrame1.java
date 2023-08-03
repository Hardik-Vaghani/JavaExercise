package CodeWithHery;

import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class JFrame1 {
    private static Component CellRendererPane;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 2; i <= a / 2; i++) {
            int remainder = a % i;
            //if remainder is 0 than numberToCheckber is not prime and break loop. Else continue loop
            if (remainder == 0) {
                System.out.println(" is not prime number");
            }
        }
    }
}
