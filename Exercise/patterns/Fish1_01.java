package Exercise.patterns;

public class Fish1_01 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i+1;j--){
                System.out.print("---");
            }
            for(int j=1;j<=i*2.5;j++){  //phyramid 
                if(i==5 && j==2){
                    System.out.print(" Q ");
                }else
                System.out.print(" * ");//j=2,i=5
            }
            for(int j=n*2;j>=i*2+1;j--){
                System.out.print("---");
            }
            for(int j=i;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i+1;j--){
                System.out.print("---");
            }
            for(int j=1;j<=i*2.5;j++){  //phyramid 
                System.out.print(" * ");
            }
            for(int j=n*2;j>=i*2+1;j--){
                System.out.print("---");
            }
            for(int j=i;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
