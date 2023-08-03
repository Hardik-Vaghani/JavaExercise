package ApnaCollage.basic;

public class PalindromicLoop {
    
    public static void main(String[] args) {
        int n=5;
        //outer loop
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // 1st hafl numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //2nd hafl number
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
