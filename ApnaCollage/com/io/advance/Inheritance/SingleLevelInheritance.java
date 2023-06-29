package ApnaCollage.com.io.advance.Inheritance;

class Shape3 {                                           //base class
    public void area() {                                     
        System.out.println("Displays Area of Shape");
    }
}
class Triangle3 extends Shape3 {                          //Derived class(Sub class)
    public void area(int l, int h) {
        System.out.println((1/2)*l*h);
    }   
}                                                                           /*/ Single Level Inheritance /*/
 

public class SingleLevelInheritance {
    public static void main(String[] args) {

    }
}
