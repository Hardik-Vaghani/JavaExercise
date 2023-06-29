package ApnaCollage.com.io.basic;

public class NestedDoWhileLoop {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        do {
            System.out.println();
            int j = 1;
            do {
                System.out.print("*");
                j ++;
            }while( j <=i );
            i ++;
        }while( i <=n );
    }
}
