package ApnaCollage.com.io.basic;

public class PreNPostIncrement {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        b = a++; // b = ++a; , b = --a;  , b = a--;  
        System.out.println(a);
        System.out.println(b);
    }
}