package Exercise.com.io.basic;

public class Array_Calculator_Division {
    public static void main(String[] args) {
        float HK[] = {100,5,2,8,2,7};
        float Div = HK[0];
        
        for(int i=1;i<HK.length;i++){
            System.out.println("Dividend number is :"+Div+" / " + HK[i] );
            Div =  Div / HK[i];
            System.out.println("Divisor is :" + Div );
        }
        System.out.println("The Rest (Rimainder) is : "+ Div );
    }
}
