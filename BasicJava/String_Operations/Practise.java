package BasicJava.String_Operations;

import java.util.Locale;

public class Practise {
    public static void main(String[] args) {

        String name = "Radha";

        System.out.println("Lenth of name: "+name.length());
        System.out.println("Compere of name: "+name.equals("Raman"));
        System.out.println("Ignore Case of name: "+name.equalsIgnoreCase("raman"));
        System.out.println("Lower Case of name: "+name.toLowerCase());
        System.out.println("Upper Case of name: "+name.toUpperCase());
        System.out.println("Join of name: "+name.concat(" Raman"));
        System.out.println("Join  of name: "+name+" Raman!");
        System.out.println("Substring of name after indexing 2 : "+name.substring(2));
        System.out.println("Substring of name after indexing 2 to 4 : "+name.substring(2,4));
    }
}
