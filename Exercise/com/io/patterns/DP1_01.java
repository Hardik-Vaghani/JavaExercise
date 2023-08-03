package Exercise.com.io.patterns;

public class DP1_01 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(" 8 ");
            }
            for(int j = 2; j<=i*2; j++){
                System.out.print(" * ");
            }
            for(int j=n*2-1;j>=i*2;j--){
                System.out.print(" 8 ");
            }
            for(int j = 2; j<=i*2; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
