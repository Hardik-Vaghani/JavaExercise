package ApnaCollage.basic;

public class StringsCompare {

    public static void main(String[] args) {
        String name1 = "b";
        String name2 = "B";

                     // s1 > s2 : +ve value
                     // s1 == s2 : 0
                     // s1 < s2 : -ve value

        // if( name1.compareTo(name2) == 0) {
        //     System.out.println("com.io.basic.Strings are equal");
        // }else{
        //     System.out.println("com.io.basic.Strings are not equal");
        // }
         name1.compareTo(name2);
        // if( name1  0 ) {
        //     System.out.println(name2);
        // }else{
        //     System.out.println(name1);
        // }
        System.out.println(name1.compareTo(name2));
    }
    
}
