package CodeWithHery.com.io;
public class CWH_033_01_Variable_Arguments_VarArgs {
    static int add(int ...arr){        // <- VarArgs
        int result = 0;
        for (int a : arr){        // <- for each loopf
            result = result + a;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(add(1,2));
        System.out.println(add(2,3,4));
        System.out.println(add(4,5,6));
    }
}
/*
public static void foo(int … arr)
{
// arr is available here as int[] arr
}
*/