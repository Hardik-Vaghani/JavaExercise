package ApnaCollage.advance.Recursion.Recursion_Class_1;

public class Recursion_Class_1_4 {
    public static int calculatFactoreal(int n){
        if (n==1 || n==0){
            return 1 ;//return n;
        }
        int fanm1 = calculatFactoreal(n-1);
        int ans = n * fanm1;
        return ans;
        
        // int fact_nm1 = n*calculatFactoreal(n-1);
        // return fact_nm1;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calculatFactoreal(n));
    }
}
//Q4. Print factorial of a number n.

/*
class Recursion_Class_1_4 {
    public static void printFactorial(int n, int fact) {
        if(n == 0) {
            System.out.println(fact);
            return;
        }
        fact *= n;
        printFactorial(n-1, fact);
    }
    public static void main(String args[]) {
        printFactorial(5, 1);
    }
}
*/