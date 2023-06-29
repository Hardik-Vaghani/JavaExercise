package Exercise.com.io.basic;

/**
 * RoundPattern
 */
public class Fish_01 {

    public static void main(String[] args) {
        int n=5,i,j;
        for(i=1;i<=n;i++){
            for(j=n-i-1;j>=1;j--){
                if (i==1 || j==1) {
                    System.out.print("   ");
                }
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
            for(j=n-i-1;j>=1;j--){
                if (i==1 || j==1) {
                    System.out.print("   ");
                }    
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