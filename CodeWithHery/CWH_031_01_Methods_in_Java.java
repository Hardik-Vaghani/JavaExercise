package CodeWithHery;
public class CWH_031_01_Methods_in_Java {
    static int logic(int x, int y){    // <- #) static method
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 5;
        }
//        x = 566;
        return z;
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;

        // Method invocation using Object creation
        //cwh_31_methods obj = new cwh_31_methods();
        //c = obj.logic(a, b);

        c = logic(a, b);     // <- #) static method calling
        System.out.println(a + " "+ b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);       // <- #) static method calling
        System.out.println(c);
        System.out.println(c1);
    }
}

/*
=> Syntax of a Method

        returnType nameOfMethod() {
        //Method body
        }

=>      int mySum(int a, int b) {
            int c = a+b;
            return c;	//Return value
        }


#) ->  The same is the case for object passing to methods.

        class calculate{
             int sum(int a,int b){
                return a+b;
            }

        public static void main(String[] args) {

                calculate obj = new calculate();
                int c = obj.sum(5,4);
                System.out.println(c);
            }
        }
 */