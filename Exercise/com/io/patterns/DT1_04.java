package Exercise.com.io.patterns;

public class DT1_04 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=2;j<=i;j++){
                System.out.print(" . ");
            }
            for(int j=n;j>=i;j--){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=2;j<=i;j++){
                System.out.print(" . ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
}
