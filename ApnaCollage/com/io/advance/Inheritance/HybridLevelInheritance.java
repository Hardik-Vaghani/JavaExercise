package ApnaCollage.com.io.advance.Inheritance;

class Shape1 {                                           //Base Class
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle1 extends Shape {                          //extend ,Derived class(Sub class)
    public void area(int h, int b) {
        System.out.println(0);
    }  
}
class Circle1 extends Shape {                            //extend ,Derived class(Sub class)
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }  
}   
class Pyramid extends Triangle1 {                         //extend ,Derived class(Sub class)         <-
    public void area(int h, int b) {
        System.out.println(0);
        System.out.println(0);
    }  
}                                                               /*/Hybrid  Level Inheritance /*/

public class HybridLevelInheritance {
    public static void main(String[] args) {
        
    }
}
