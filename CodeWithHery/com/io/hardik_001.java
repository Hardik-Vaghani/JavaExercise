package CodeWithHery.com.io;
import java.util.Scanner;
public class hardik_001 {
public static double aria(int r, int h) throws ArithmeticException {
//    if(r<=0||h<=0){
//        throw new ArithmeticException(){
//            @Override
//            public String getMessage() {
//                return "yguygu guyg";
//            }
//
//            @Override
//            public String toString() {
//                return "iuymmb guy gk";
//            }
//        };
//    }
//    return (2*Math.PI*r*h)+(2*Math.PI*r*r);
    return r/h;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try {
            double A = aria(a,b);
            System.out.println("the aria is : "+ A);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println(e);
            e.printStackTrace();
            System.out.println("kasjf");

        }
    }
}

