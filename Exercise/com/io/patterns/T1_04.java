package Exercise.com.io.patterns;// package Java.PatternS;

public class T1_04 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
