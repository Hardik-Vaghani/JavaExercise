package ApnaCollage.com.io.basic;

import java.util.Scanner;

public class UpdateBitManipulation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper=1 -> set; oper=0 -> clear
       int n = 5; 
       int pos = 1;
      
       int bitMask = 1<<pos;
       if(oper == 1) {
           //set   => 0111
           int newNumber = bitMask | n;
           System.out.println(newNumber);
        } else {
        //clear    => 0001
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;
        System.out.println(newNumber);
        }
      
    }
 
}
