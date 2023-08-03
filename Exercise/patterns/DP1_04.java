package Exercise.patterns;

public class DP1_04 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){  //-1 ahiya che
                System.out.print(" . ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){        //i=2 thi chale che
            for(int j=1;j<=i-1;j++){  //-1 ahiya che
                System.out.print(" . ");
            }
            for(int j=n;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){  //-1 ahiya che
                System.out.print(" . ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){        //i=2 thi chale che
            for(int j=1;j<=i-1;j++){  //-1 ahiya che
                System.out.print(" . ");
            }
            for(int j=n;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }    
}
