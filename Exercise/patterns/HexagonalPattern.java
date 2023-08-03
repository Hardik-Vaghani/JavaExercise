package Exercise.patterns;

/**
 * Exercise.patterns.RoundPattern
 */
public class HexagonalPattern {

    public static void main(String[] args) {
        int n=3,i,j;
        for(i=1;i<=n;i++){
            for(j=n-i;j>=1;j--){
                System.out.print("   ");
            } 
            for(j=1;j<=i;j++){
                System.out.print(" * ");
            } 
            for(j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(i=n;i>=1;i--){
            for(j=n-i;j>=1;j--){
                System.out.print("   ");
            } 
            for(j=1;j<=i;j++){
                System.out.print(" * ");
            } 
            for(j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}