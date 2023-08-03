package ApnaCollage.advance.Recursion.Recursion_Class_2;
public class Recursion_Class_2_6 {
    public static void subsequences(String str,int idx,String newstring){
        if(idx==str.length()){
            System.out.println(newstring);
            return;
        }

        char currentChar = str.charAt(idx);
        //tobe
        subsequences(str, idx+1, newstring+currentChar);
        //ro not to be
        subsequences(str, idx+1, newstring);

    }
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
    
}
//Q7. Print all the subsequences of a string.
/*
public class Recursion_Class_2_6 {
    public static void printSubseq(String str, int idx, String res) {
        if(idx == str.length()) {
            System.out.println(res);
            return;
        }
        //choose
        printSubseq(str, idx+1, res+str.charAt(idx));
        //don't choose
        printSubseq(str, idx+1, res);
    }
    public static void main(String args[]) {
        String str1 = "abc";
        String str2 = "aaa";
        printSubseq(str1, 0, "");
    }
}
    *///Time complexity - O(2^n)
