package CodeWithHery.com.io;

class EkClass {
    int a;

    public int getA() {
        return a;
    }

    EkClass(int a) {
        this.a = a;             // <==== this key word no use karel che / agal pass karava mate use thay che
    }

    public int returnone() {
        return 1;
    }
}
class DoClass extends EkClass {
    DoClass(int c) {
        super(c);               //  <=== super key no use larel che
        System.out.println("I am a constructor");
    }
}


public class CWH_047_01_This_and_Super_Keyword{
    public static void main(String[] args) {
        EkClass e = new EkClass(65);
        DoClass d = new DoClass(5);
        System.out.println(e.getA()); } }
//class cwh{
//    int x;
//
//    //    getter of x
//    public  int getX(){
//        return  x;
//    }
//
//    // Constructor with a parameter
//    cwh(int x) {
//        this.x = x;
//    }
//
//    // Call the constructor
//public class CWH_047_01_ {
//        public static void main(String[] args) {
//            cwh obj1 = new cwh(65);
//            System.out.println(obj1.getX());
//
//        }
//}