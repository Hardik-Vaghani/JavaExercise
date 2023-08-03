package ApnaCollage.basic;

public class SolidHollowRhombus {

    public static void main(String[] args) {
        int n=5;
        int m=4;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=m;j++){
                //cell->(i,j)
                if(i==1||j==1||i==n||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
