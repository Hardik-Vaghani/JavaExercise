package BasicJava.This_Static_Final_Keywords;

public class MyClassStatic {
     static int count=0;     //will get memory only once and retain its value

MyClassStatic(){
    count++;    //incrementing the value of static variable
    System.out.println(count);
}

    public static void main(String[] args) {
        //creating objects
        MyClassStatic mcs1 = new MyClassStatic();
        MyClassStatic mcs2 = new MyClassStatic();
        MyClassStatic mcs3 = new MyClassStatic();
    }
}
