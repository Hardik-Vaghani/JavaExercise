package ApnaCollage.advance.Recursion.Patterns;

public class Pattern002 {
    public static void main(String[] hardik) {
        printPattern(1);
    }

    private static void printPattern(int n) {
        if (n == 6) {
            return;
        }
        //logic
        printPatternHelper(n);

        System.out.println();
        n++;
        printPattern(n);
    }

    private static void printPatternHelper(int m) {
        if (m == 0) {
            return;
        }
        //logic
        System.out.print(m);
        printPatternHelper1(m);
        m--;
        printPatternHelper(m);
    }

    private static void printPatternHelper1(int l) {
        if (l == 0) {
            return;
        }
        System.out.print("*");
        l = l -1;
        printPatternHelper1(l);
    }
}
