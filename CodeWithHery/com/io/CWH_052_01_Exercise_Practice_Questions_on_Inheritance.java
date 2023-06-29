package CodeWithHery.com.io;
class Circle1{
    public int radius;
    Circle1(){

        System.out.println("I am non param of circle");
    }
    Circle1(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){

        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class CWH_052_01_Exercise_Practice_Questions_on_Inheritance {
    public static void main(String[] args) {
        // Problem 1
        // Circle objC = new Circle(12);
        Cylinder1 obj = new Cylinder1(12, 4);
    }

}
/* problem:

   *) Create a class circle and use inheritance to create another class cylinder from it
   *) Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible
   *) Create a method for area and volume in 1
   *) create methods for area & volume in 2 also create getters and setters
   *) What is the order of constructor execution for the following inheritance hierarchy
                        Base

                       Derived 1

                       Derived 2

    Derived obj = new Derived 2( );
    Which constructor(s) will be executed & in what order?
 */