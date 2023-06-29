package Exercise.com.io.patterns;

public class A {
    public static void main(String[] args) {
        int n = 5;
        int x = n;
        for( int i = 1; i <= n ; i ++ ) {
            for( int j = 1; j < 2*n; j ++) {
                if( j==x || j==n+i-1 ) {
                    System.out.print(j);
                }else if((j>=x)!=false && j<=n+i-1 && i==n/2+1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            x--;
        }
    }
    
}
