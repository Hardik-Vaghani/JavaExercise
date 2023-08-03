package CodeWithHery;
public class CWH_034_01_Recursion {
//    static void fun2(int n){
//        if(n>0){
//            fun2(n-1);
//            System.out.println(n);
//        }
//    }
//
//
//    public static void main(String[] args){
//        int n = 3;
//        fun2(n);
//    }

/*
=-> //factorial(n) = n*factorial(n-1)                 [n >= 1]
     factorial(n) = n * n-1 * n-1 * ......
     factorial(5) = 5*4*3*2*1 ==120
*/


//    public int fact = 0;
//    static int factorial(int n){
//
//        if(n==0 || n==1){
//             return 1;
//        }else{
//            return n * factorial(n- 1);
//        }


        static int factorial(int n) {
            if(n==0 || n==1){
                return 1;
            }
            else {
                int product = 1;
                for(int i=1;i<=n;i++){
                    product *=i;
                }
                return product;
            }
        }

    public static void main(String[] args){
            int n = 5;
        System.out.println("the value of factorial is : " + factorial(n));
        System.out.println("the value of factorial is : " + factorial(n));
    }
}
