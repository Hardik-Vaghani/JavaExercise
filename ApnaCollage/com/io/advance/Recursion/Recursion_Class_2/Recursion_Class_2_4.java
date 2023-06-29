package ApnaCollage.com.io.advance.Recursion.Recursion_Class_2;
public class Recursion_Class_2_4 {
    public static void moveAllX(String str,int idx,int count,String newString){
        if (idx==str.length()){
            for(int i=0;i<count;i++){
                newString+='X';
            }
            System.out.println(newString);
            System.out.println("end");
            return ;
        }
        char currentChar=str.charAt(idx);
        if(currentChar=='x'){
            count++;
            moveAllX(str, idx+1, count, newString);//<==idx+1
        }else{
            newString = newString + currentChar;
            moveAllX(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str="axbcdxxd"; 
        moveAllX(str,0,0,"");
       
    }
}
//Q5. Move all ‘x’ to the end of the string. - O(n)
/*
public class  Recursion_Class_2_4 {
//to add all 'x' to the end of the string
    public static String addX(int count) {
        String newStr = "x";
        for(int i=1;i<count; i++) {
            newStr += 'x';
        }
        return newStr;
    }
    public static String moveAllX(String str, int idx, int count) {
        if(idx == str.length()) {
            return addX(count);
        }
        if(str.charAt(idx) == 'x') {

            return moveAllX(str, idx+1, count+1);
        } else {
            String nextStr = moveAllX(str, idx+1, count);
            return str.charAt(idx) + nextStr;
        }
    }
    public static void main(String args[]) {
        String str = "abcdefxghxixjxxxk";
        int count = 0;
        String newStr = moveAllX(str, 0, count);
        System.out.println(newStr);
    }
}
*/