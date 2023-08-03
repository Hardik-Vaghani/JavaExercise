package ApnaCollage.com.io.advance.Recursion.Recursion_Class_2;
public class Recursion_Class_2_2 {
    public static int first = -1 ;
    public static int last = -1;

    public static void getIndices(String str, char el, int idx) {
        if(idx == str.length()) {
         return;
        }
        if(str.charAt(idx) == el) {
            if(first == -1) {
            first = idx;
            } else {
                last = idx;
        }
    }
    getIndices(str, el, idx+1);
    }
    public static void main(String[] args) {
        String str = "tabcdfghijakkk";
        char el = 'a';
        getIndices(str, el, 0);
        System.out.println("First occurence : " + first);
        System.out.println("Last occurence : " + last);
    }
}
//Q3. Find the occurrence of the first and last occurrence of an element using recursion.