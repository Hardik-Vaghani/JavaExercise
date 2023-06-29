package Exercise.com.io.patterns;

public class DT1_03 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    } 
}
   