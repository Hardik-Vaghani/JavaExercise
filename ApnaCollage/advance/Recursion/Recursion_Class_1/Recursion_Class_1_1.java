package ApnaCollage.advance.Recursion.Recursion_Class_1;

public class Recursion_Class_1_1 {
    public static void printNumbers(int n) {
        if(n == 0) {
        return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        printNumbers(n);
    }
}
//Q1. Print numbers from 5 to 1.