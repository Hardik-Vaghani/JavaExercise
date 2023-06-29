package CodeWithHery.com.io;
//class A{
//    public void meth1(){
//        System.out.println("I am method 1 of class A");
//    }
//}
//
//class B extends A{
//
//}
//public class CWH_048_01_Method_Overriding {
//    public static void main(String[] args) {
//        A a = new A();
//        a.meth1();
//
//        B b = new B();
//        b.meth1();
//    }
//}
/*
Output :
        I am method 1 of class A
        I am method 1 of class A
 */
class A{
    public void meth1(){
        System.out.println("I am method 1 of class A");
    }
}

class B extends A{
    @Override
    public void meth1(){
        System.out.println("I am method 1 of class B");
    }


}
public class CWH_048_01_Method_Overriding {
    public static void main(String[] args) {
//        A a = new A();
//        a.meth1();

        B b = new B();  // ahiya a ane b  banne call thava joyoie pn a chodine b ni method overrid karile che
        b.meth1();
    }
}
/*
Output :
        I am method 1 of class A
        I am method 1 of class B
 */