package ApnaCollage.com.io.advance;

class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
    }  
}
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }  
}
 

public class Polymorphism {
    public static void main(String[] args) {
        
    }
}                                         
