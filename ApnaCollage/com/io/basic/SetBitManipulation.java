package ApnaCollage.com.io.basic;

public class SetBitManipulation {
    
    public static void main(String[] args) {
        int n = 5; //0101  => 0111
        int pos = 1;
        int bitMask = 1<<pos;
   
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
  
}
