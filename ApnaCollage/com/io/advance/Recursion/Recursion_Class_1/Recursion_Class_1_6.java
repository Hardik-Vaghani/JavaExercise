package ApnaCollage.com.io.advance.Recursion.Recursion_Class_1;

public class Recursion_Class_1_6 {
    public static int printPower(int x, int n) {
        if(n == 0) {//base case
            return 1;
        }
        if(x == 0) {//base case
            return 0;
        }else{

            int x_ = printPower(x, n-1);
            int xn = x * x_ ;
            return xn;
        }
    }

    public static void main(String args[]) {
        int x = 2, n = 5;
        int output = printPower(x, n);
        System.out.println(output);
    }
    
}
//Q6. Print x^n (with stack height = n)