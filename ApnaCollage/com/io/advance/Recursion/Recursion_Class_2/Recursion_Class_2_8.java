package ApnaCollage.com.io.advance.Recursion.Recursion_Class_2;
public class Recursion_Class_2_8 {

    public static String [] keypad =  {".","ABC","DEF","GHI","JKL","MNO","PQRS","TU","VWX","YZ"};

    public static void printcomb(String str, int idx, String combnation){
        if(idx==str.length()){
            System.out.println(combnation);
            return;
        }
        char currentChar = str.charAt(idx);
        String mapping = keypad[currentChar - '0'];
        
        for(int i=0; i<mapping.length(); i++){
            printcomb(str, idx+1, combnation+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "76";
        printcomb(str, 0, "");
    }
}
//Q9. Print keypad combination
/*
( 0 -> .;
1 -> abc
2 -> def
3 -> ghi
4 -> jkl
5 -> mno
6 -> pqrs
7 -> tu
8 -> vwx
9 -> yz
)
*/
// public class Recursion_Class_2_8 {
//     public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs","tu", "vwx", "yz"};

//     public static void printKeypadCombination(String number, int idx, String res) {
//         if(idx == number.length()) {
//             System.out.println(res);
//             return;
//         }
    
//         for(int i=0; i<keypad[number.charAt(idx)-'0'].length(); i++) {
//             char curr = keypad[number.charAt(idx)-'0'].charAt(i);
//             printKeypadCombination(number, idx+1, res+curr);
//         }
//     }
//     public static void main(String args[]) {
//         String number = "23";
//         printKeypadCombination(number, 0, "");
//     }
// }