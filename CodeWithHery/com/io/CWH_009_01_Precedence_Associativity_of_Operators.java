
package CodeWithHery.com.io;
public class CWH_009_01_Precedence_Associativity_of_Operators {
    public static void main(String[] args) {
        float a=6,b=2,c=2,d=1;

        float k=b*b+((c-d)/a);/* Precedence & Associativity */
        System.out.println(k);
    }
}
/*
        / * -> L to R

        + - -> L to R

        ++, = -> R to L
 */

   // Precedence & Associativity

    //int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */
    //int b = 60/5-34*2;
        /*
            = 12-34*2
            =12-68
            =-56
         */

    //System.out.println(a);
    //System.out.println(b);

    // Quick Quiz
/*    int y = 1;
    //  int k = x * y/2;

    int b = 0;
    int c = 0;
    int a = 10;
    int k = b*b - (4*a*c)/(2*a);
        System.out.println(k);

                }
                */
