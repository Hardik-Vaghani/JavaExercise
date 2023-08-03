package ApnaCollage.advance.Recursion.Recursion_Class_1;

public class Recursion_Class_1_2 {
    public static void printNumbers(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumbers(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printNumbers(n);
    }
}
//Q2. Print numbers from 1 to 5.