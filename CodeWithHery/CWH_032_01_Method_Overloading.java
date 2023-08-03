package CodeWithHery;
public class CWH_032_01_Method_Overloading {
    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static void foo(int a, int b, int c){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

//    static void change(int a){
//        a = 98;
//    }

//    static void change2(int [] arr){
//        arr[0] = 98;
//    }

//    static void tellJoke(){
//        System.out.println("I invented a new word!\n" +
//                "Plagiarism!");
//    }

    public static void main(String[] args) {
        // tellJoke();

        // Case 1: Changing the Integer
        //int x = 45;
        //change(x);
        //System.out.println("The value of x after running change is: " + x);

        // Case 2: Changing the Array
        // int [] marks = {52, 73, 77, 89, 98, 94};
        // change2(marks);
        // System.out.println("The value of x after running change is: " + marks[0]);


        // Method Overloading
        foo();
        foo(3000);
        foo(3000, 4000);
        // Arguments are actual!


    }
}

/*
A)+>    By changing the return type :

        class calculate{
             int multiply(int a,int b){
                return a*b;
            }
            double multiply(double a,double b){
                 return  a*b;
            }

        public static void main(String[] args) {

                calculate obj = new calculate();
                int c = obj.multiply(5,4);
                double d = obj.multiply(5.1,4.2);
                System.out.println("Mutiply method : returns integer : " + c);
                System.out.println("Mutiply method : returns double : " +  d);

        }
        }
Output :
        Mutiply method : returns integer : 20
        Mutiply method : returns double : 21.419999999999998


B)+>    By changing the number of arguments passed :

                class calculate{
                     int multiply(int a,int b){
                        return a*b;
                    }
                    int multiply(int a,int b,int c){
                         return  a*b*c;
                    }

                public static void main(String[] args) {

                        calculate obj = new calculate();
                        int c = obj.multiply(5,4);
                        int d = obj.multiply(5,4,3);
                        System.out.println(c);
                        System.out.println(d);

                }
                }

Output :
        20
        60



=> Note: Method overloading cannot be performed by changing the return type of methods.
 */