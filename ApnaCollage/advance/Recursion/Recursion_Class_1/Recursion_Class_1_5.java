package ApnaCollage.advance.Recursion.Recursion_Class_1;

public class Recursion_Class_1_5 {
    public static void prinFibonacci(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        prinFibonacci(b, c, n-1);

    }
    public static void main(String[] args) {
        int a=0,b=1,n=7;
        System.out.println(a);
        System.out.println(b);
        prinFibonacci(a, b, n-2);

    }
    
}

//Q5. Print the fibonacci sequence till nth term.

// class Recursion_Class_1_5 {
//     public static void printFactorial(int a, int b, int n) {
//         if(n == 0) {
//             return;
//         }
//         System.out.println(a);
//         printFactorial(b, a+b, n-1);
//     }

//     public static void main(String args[]) {
//         printFactorial(0, 1, 5);
//     }
// }
