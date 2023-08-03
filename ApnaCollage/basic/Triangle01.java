package ApnaCollage.basic;

public class Triangle01{

    public static void main(String[] args) {
        int n=5;

        //outer loops
        for(int i=1;i<=n;i++){
            //inner loops
            for(int j=1;j<=i;j++){

                int sum = i+j; 

                if(sum % 2 == 0){//even value
                    System.out.print("1 ");
                }else{//odd value
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}