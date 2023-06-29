package ApnaCollage.com.io.basic;

import java.util.Scanner;

public class Strings {
    
    public static void main(String[] args) {
        //Scanner Sc = new Scanner(System.in);
        //String name = Sc.next();  //next for single token
        //String fullname = Sc.nextLine();//nextline for full line with space

        //Concatention

        String firstname = "Tony";
        String lastname = "Stark";
        String fullname =  firstname + " " + lastname;// firstname + lastname;
        // System.out.println("My Name Is:"+ fullname.length()); //.length thi sankhya ni ganatari thay che
        // System.out.println("My name is:"+fullname);

        for( int i = 0; i < fullname.length(); i ++) {
            System.out.println(fullname.charAt(i)); //single token charcter print thay che
        }
    }
}
