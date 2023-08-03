package CodeWithHery;
public class CWH_010_01_Expressions_AND_Increment_Decrement_Operators {
    public static void main(String[] args) {
        int a=10;                   // Increment ( Post Increment & Pre Increment )
//        System.out.println("INCREMENT");
//        System.out.println("a :" + a);  //10
//        System.out.println("Post Increment");
//        System.out.println("a :" + a++);  //10
//        System.out.println(a);  //11
//        System.out.println("Pre Increment");
//        System.out.println("a :" + ++a);  //12
//        System.out.println(a);  //12
//                                    // Decrement ( Post Decrement & Pre Decrement )
//        System.out.println("DECREMENT");
//        System.out.println(a);  //12
//        System.out.println("Post Decrement");
//        System.out.println("a :" + a--);  //12
//        System.out.println(a);  //11
//        System.out.println("Pre Decrement");
//        System.out.println("a :" + --a);  //10
//        System.out.println(a);  //10

//        int b=5;
//        int c=b++*2;   //b=5
//        System.out.println(c);//10
//        System.out.println(b);//6

        int b=5;
        int c=++b*2;  //b=6
        System.out.println(c);//12
        System.out.println(b);//
        char ch='a';
        System.out.println(++ch);
    }
}
/*
10 Resulting data type after arithmetic operation

Result = byte + short -> integer
Result = short + integer -> integer
Result = long + float -> float
Result = integer + float -> float
Result = character + integer -> integer
Result = character + short -> integer
Result = long + double -> double
Result = float + double -> double

2) Increment and Decrement operators

a++, ++a (Increment Operators)
a--, --a (Decrement Operators)
These will operate on all data types except Booleans.

=> Quick Quiz: Try increment and decrement operators on a Java variable

a++ -> first use the value and then increment
++a -> first increment the value then use it

=> Quick Quiz: What will be the value of the following expression(x).

int y=7;
int x = ++y*8;
value of x?
char a = ‘B’;
a++; (a is not ‘C’)
 */