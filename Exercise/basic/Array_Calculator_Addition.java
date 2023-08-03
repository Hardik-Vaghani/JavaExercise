package Exercise.basic;

public class Array_Calculator_Addition {
    public static void main(String[] args) {
        int[] HK = {32,12,35,7,9,01,4,38,7};
        int sum = 0;
        
        int i=0;
        while(i<HK.length){
            System.out.println("Additor is : "+sum+" + "+HK[i]);
            sum = sum + HK[i];
            System.out.println("Addition Total is  : "+ sum );
            i++;
        }

        System.out.print("Directe Total is : "+sum);
    }
}
