package ApnaCollage.advance.Recursion.Patterns;

public class Pattern001 {
    public static void main(String[] hardik) {
        printPattern(1);//5
    }

    private static void printPattern(int n) {
        if (n == 10) {//0
            return;
        }
        //logic 1
//        for (int i=n; i>=1; i--) {
//            System.out.print(i);
//        }
        //logic 2
        printPatternHelper(n);

        System.out.println();
        n++;//n--
        printPattern(n);
    }

    private static void printPatternHelper(int m) {
        if (m==0){
            return;
        }
        System.out.print(m);
        m--;
        printPatternHelper(m);
    }
}
