package ApnaCollage.basic;

import java.util.Scanner;

public class Function {

    public static void prinMyName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        
        prinMyName(name);
    }
    
}
