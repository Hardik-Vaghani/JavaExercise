package ApnaCollage.com.io.basic;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Function {

    public static void prinMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        
        prinMyName(name);
    }
    
}
