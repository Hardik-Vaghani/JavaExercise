package Exercise.com.io.patterns;// package Java.PatternS;

public class P1_02 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-i*2+1;j++){   //(j<=2*n-i*2) condition javi
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
