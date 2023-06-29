package BasicJava.String_Operations;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_Split {
    public static void main(String[] args) {
        String name = "R:a:d:h:a Ra:m:a:n";      //["R+a+d+h+a"]

//        String[] arrname = name.split(":"); //[ "\\+", "\\@", "\\#", "\\$",....  amuk special no use am  karvo]
        String[] arrname = name.split(":",2);   //limit 0 (-1,-2,..)ma badhu karide che, baki jetali limit hashe tya sudhi te string ma store kare che.
        System.out.println("Split is ':' on name1: "+ Arrays.toString(arrname));


        for (String a : arrname) {
            System.out.println(a);
        }
    }
}
