package Exercise.com.io.basic;

public class Array_Calculator_Multiplication {
    
    public static void main(String[] args) {
        int[] HK = {32,12,35,7,9,01,4,38,7};
        int mul = 1;
        int i=0;
        while(i<HK.length){
            System.out.println("Multipled number is :"+mul+" * "+HK[i]);
            mul = mul * HK[i];
            System.out.println("Multipliction Total is : "+ mul );
            i++;
        }
        System.out.print("Directe Total is : "+mul);
    }
}