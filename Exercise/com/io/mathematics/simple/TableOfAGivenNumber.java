package Exercise.com.io.mathematics.simple;

import java.util.Scanner;

public class TableOfAGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number := ");
        int n = scanner.nextInt();
        int j=1;
        while (j<=10){
            System.out.println("\t"+n+"\t*\t"+j+"\t=\t"+(j*n));
            j++;
        }
    }

}
