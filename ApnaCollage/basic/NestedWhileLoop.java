package ApnaCollage.basic;

public class NestedWhileLoop {
    
    public static void main(String[] args) {
        int n=5;
        int i = 1;
        while( i <= n ) {
            System.out.println();
            // i ++;

            int j = 1;
            while( j <=i ) {
                System.out.print("*");
                j ++;
            }
            i ++;
        }
    }
}
