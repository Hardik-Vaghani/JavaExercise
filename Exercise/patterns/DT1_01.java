package Exercise.patterns;

public class DT1_01 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j+" ");
            }
            for(int j=n*2;j>i*2;j--){//for space pyramid
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
    
}
