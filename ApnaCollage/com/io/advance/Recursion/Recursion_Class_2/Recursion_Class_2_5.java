package ApnaCollage.com.io.advance.Recursion.Recursion_Class_2;
// public class Recursion_Class_2_5 {
//     public static boolean map[]=new boolean[26];

//     public static void removeDuplicate(String str,int idx,String newString){
//         if(idx==str.length()){
//             System.out.println(newString);
//             return;
//         }

//         char currentChar = str.charAt(idx);
//         if(map[currentChar-'a']==true){  //(map[currentChar-'a']) karan k if ma true codntion joyye
//             removeDuplicate(str, idx+1, newString);
//         }else{
//             newString += currentChar;
//             map[currentChar-'a']=true;
//             removeDuplicate(str, idx+1, newString);

//         }
//     }
//     public static void main(String[] args) {
//         String str="aabbriteiutggkdljz";
//         removeDuplicate(str, 0, "");
//     }
// }
//Q6. Remove duplicates in a string.













public class Recursion_Class_2_5 {
    public static String removeDuplicates(String str, int idx, boolean present[]) {
        if(idx == str.length()) {
            return "";
        }
        char curr = str.charAt(idx);
        if(present[curr-'a']==true) {
            return removeDuplicates(str, idx+1, present);
        } else {
            present[curr-'a'] = true;
            return curr +  removeDuplicates(str, idx+1, present);
        }
    }
    public static void main(String args[]) {
        String str = "abcadbcefghabiz";
        boolean present[] = new boolean[26];// string ni length type no array ni length che
        System.out.println(removeDuplicates(str, 0, present));
       
    }
}
