package ApnaCollage.com.io.basic;

public class GetBitManipulation {

    public static void main(String[] args) {
       int n = 5; //0101
       int pos = 3;
       int bitMask = 1<<pos;
      
      //  if((bitMask & n) == 0) {
      //     System.out.println("bit was zero");
      //   } else {
      //     System.out.println("bit was one");
      //   }
       int num= (bitMask & n );
       System.out.println(num);
    }
     
     
    
}
