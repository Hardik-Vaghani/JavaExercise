package ApnaCollage.basic;

import java.util.Scanner;

public class CondiTions {

    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        
        if(a==b) {
            System.out.println("Equal");
        }else{               // 1 else & 2 if (ne bhega kari devathi "else if" conditions thay jay che)
            if(a > b) {
                System.out.println("a is greater");
            }else{
                System.out.println("a is lesser");
            }
        }


        //int x=cs.nextInt();
        //int age=cs.nextInt();

        //if( x % 2 == 0 ){//age>18){
        //    System.out.println("even");//"adult");
        //}else{
        //    System.out.println("odd");//"not adult");
        //}
    }
}    
