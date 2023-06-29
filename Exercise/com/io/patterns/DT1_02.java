package Exercise.com.io.patterns;

public class DT1_02 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            for(int j=3;j<=i*2;j++){   // (int j=2;j<=i*2-1;j++) same condition che
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
