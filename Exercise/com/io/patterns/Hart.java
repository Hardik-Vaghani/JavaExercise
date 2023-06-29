package Exercise.com.io.patterns;

public class Hart {
    public static void main(String[] args) {
        int n = 5,i,j;
        for(i=1;i<=3;i++){
            for(j=1;j<=n-2-i;j++){
                System.out.print("   ");
            }
            for(j=1;j<=(2*i)-1;j++){
                System.out.print(" * ");
            }   
            for(j=1;j<=2*(n-2-i);j++){
                System.out.print("   ");
            }
            for(j=1;j<=(2*i)-1;j++){
                System.out.print(" * ");
            }   
            System.out.println();
        }

        for(i=1;i<n;i++){
            for(j=1;j<=i;j++){
                System.out.print("   ");
            }
            for(j=(n*2)-i-i;j>0;j--){
                System.out.print(" * ");
            }

            System.out.println();
        }   

    }
}