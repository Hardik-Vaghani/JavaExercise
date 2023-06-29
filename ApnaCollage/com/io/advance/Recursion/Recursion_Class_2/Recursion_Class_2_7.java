package ApnaCollage.com.io.advance.Recursion.Recursion_Class_2;
import java.util.HashSet;

// public class Recursion_Class_2_7 {
//     public static void subsequences( String str, int idx, String newstring, HashSet<String>set ){
//         if(idx==str.length()){
//             if(set.contains(newstring)){
//                 return;
//             }else{
//                 set.add(newstring);

//                 System.out.println(newstring);
//                 return;
//             }
//         }

//         char currentChar = str.charAt(idx);
//         //tobe
//         subsequences(str, idx+1, newstring+currentChar,set);
//         //ro not to be
//         subsequences(str, idx+1, newstring,set);

//     }
//     public static void main(String[] args) {
//         String str = "aaa";
//         HashSet<String>set=new HashSet<>();
//         subsequences(str, 0, "",set);
//     }
// }
//Q8. Print all unique subsequences of a string.

public class Recursion_Class_2_7 {
    public static void printSubseq(String str, int idx, String res, HashSet<String>allSubseq) {
        if(idx == str.length()) {
            if(allSubseq.contains(res)) {
            return;
            }
            allSubseq.add(res);
            System.out.println(res);
            return;
        }

        //choose
        printSubseq(str, idx+1, res+str.charAt(idx), allSubseq);
        //don't choose
        printSubseq(str, idx+1, res, allSubseq);

    }
    public static void main(String args[]) {
        String str1 = "abc";
        String str2 = "aaa";
        HashSet<String> allSubseq = new HashSet<>();
        printSubseq(str2, 0, "", allSubseq);
    }
}
