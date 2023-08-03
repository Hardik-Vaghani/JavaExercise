package ApnaCollage.basic;

public class ClearBitManipulation {
    
    public static void main(String[] args) {
        int n = 5; //0101 => 0001
        int pos = 2;
        int bitMask = 1<<pos;
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;
        System.out.println(newNumber);
    }
   
}
