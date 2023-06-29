package Exercise.com.io.patterns;

public class DP1_02 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=n-1;j>=i;j--){
                System.out.print("8");
            }
            for(int j=1*2;j<=i*2;j++){
                System.out.print("*");
            }
            for(int j=n*2-1;j>=i*2;j--){
                System.out.print("8");
            }
            for(int j=1*2;j<=i*2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
