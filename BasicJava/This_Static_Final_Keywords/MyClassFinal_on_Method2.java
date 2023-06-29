package BasicJava.This_Static_Final_Keywords;

public class MyClassFinal_on_Method2 extends MyClassFinal_on_Method{   //[final method can be inherited but can`t be overridden.]
//    void run(){
//        System.out.println("running overrid");        //[compile time error]
//    }

    public static void main(String[] args) {
        MyClassFinal_on_Method2 mcfm2 = new MyClassFinal_on_Method2();
        mcfm2.run();
    }
}
