package CodeWithHery.com.io;
public class CWH_017_01_Logical {
    public static void main(String[] args) {
        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = false;
//        if (a && b){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }

        System.out.println("For Logical OR...");

//        if (a || b){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }

        System.out.println("For Logical NOT");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}
/*
#)      Relational and Logical Operators in Java

#)=>  Relational Operators in Java :
        Relational operators are used to evaluate conditions (true or false) inside the if statements. Some examples of relational operators are:

                == (equals)
                >= (greater than or equals to)
                > (greater than)
                < (less than)
                <= (less than or equals to)
                != (not equals)
Note: ‘=’ is used for an assignment whereas ‘==’ is used for equality check. The condition can be either true or false.

#)=> Logical Operators :
Logical operators are used to provide logic to our Java programs.
There are three types of logical operators in Java :
        ->        && - AND
        ->        || - OR
        ->        ! – NOT

#) AND Operator :
    Evaluates to true if both the conditions are true.

                Y && Y = Y
                Y && N = N
                N && Y = N
                N && N = N
Convention: # Y – True and N - False

#) OR Operator :
    Evaluates to true when at least one of the conditions is true.

                Y || Y = Y
                Y || N = Y
                N || Y = Y
                N || N = N
Convention: # Y – True and N - False

#) NOT Operator :
    Negates the given logic (true becomes false and vice-versa)

                !Y = N
                !N = Y
 */