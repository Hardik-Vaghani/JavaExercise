package Exercise.com.io.basic;

public class Array_Calculator_Subtraction {
    
    public static void main(String[] args) {
        float HK[] = {32,12.15f,35,7,9.6f,01,4,38,7};
        float Minus = HK[0];
        int i=1;
        while(i<HK.length){
            System.out.println("Detract by :"+Minus+" - "+HK[i]);
            Minus = Minus - HK[i];
            System.out.println("Decreasing Total : "+ Minus );
            i++;
        }
        System.out.print("Directe Total is : "+ Minus);
    }
}
