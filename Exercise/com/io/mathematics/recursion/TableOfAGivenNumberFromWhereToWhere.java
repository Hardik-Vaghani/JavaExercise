package Exercise.com.io.mathematics.recursion;

import java.util.Scanner;

public class TableOfAGivenNumberFromWhereToWhere {

    static int i = 1;

    private static void callRecursionFunction(int n) {
        if (i == 11) {
            return;
        }
        System.out.println("\t" + n + "\t*\t" + i + "\t=\t" + (i * n));
        i++;
        callRecursionFunction(n);//recalling
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose normal table or custom table");
        System.out.println("type normal \\ type custom");
        System.out.print("Enter your Type := ");

        String type = scanner.next();
        if (type.equals("normal")) {
            System.out.print("Enter your number := ");
            int n = scanner.nextInt();
            System.out.println("__\t__\t__\t__\t__\t__\t__");

            callRecursionFunction(n);
        } else {
            System.out.print("Enter your number := ");
            int m = scanner.nextInt();

//            System.out.print("From "+(from = scanner.nextInt()) +" to "+(to = scanner.nextInt()));
            System.out.print("From : ");
            from = scanner.nextInt();
            System.out.print("to : ");
            to = scanner.nextInt();

            if (from <= to) {
                System.out.println("__\t__\t__\t__\t__\t__\t__");
                callRecursionFunction1(m);
            } else
                System.out.println("__\t__\t__\t__\t__\t__\t__\t__:-> its not allow in this program");

        }
    }

    static int from;
    static int to;

    private static void callRecursionFunction1(int m) {
        if (from == (to + 1)) {
            return;
        }
        System.out.println("\t" + m + "\t*\t" + from + "\t=\t" + (m * from));
        from++;
        callRecursionFunction1(m);//recalling
    }


}
