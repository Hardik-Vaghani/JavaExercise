package ApnaCollage.advance.Inheritance;

class Shape {                                           //Base Class
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape {                          //Derived class(Sub class)
    public void area(int h, int b) {
        System.out.println(0);
    }  
}
class Circle extends Shape {                            //Derived class(Sub class)
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }  
}                                                                   /*/ Hierar Level Inheritance /*/
 

public class HierarchicalLevelInheritance {             
    public static void main(String[] args) {
        
    }
    
}
