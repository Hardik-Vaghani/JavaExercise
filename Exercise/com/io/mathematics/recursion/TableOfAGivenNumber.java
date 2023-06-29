package Exercise.com.io.mathematics.recursion;

import java.util.Scanner;

public class TableOfAGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number := ");
        int n = scanner.nextInt();

        callRecursionFunction(n);
    }

    static int i=1;
    private static void callRecursionFunction(int n) {
        if (i == 11){
            return;
        }
        System.out.println("\t"+n+"\t*\t"+i+"\t=\t"+(i*n));
        i++;
        callRecursionFunction(n);

    }
}
