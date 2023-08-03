package CodeWithHery;
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }


}

class Rectangle1{
    private final int length;
    private final int breadth;

    public Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class CWH_044_01_Exercise_on_Access_Modifiers_and_Constructors {

    public static void main(String[] args) {
        /*
        // Problem 1
        Cylinder myCylinder = new Cylinder(9, 12);
        //myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        //myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        // Problem 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
         */


        // Problem 3
        Rectangle1 r = new Rectangle1(12, 56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());







    }
}
/*
problems:=>
   1 create a class cylinder and use getter and setters to set its radius and height
   2 use ➊ to calculate surface and volume of the cylinder
   3 Use a constructor and repeat ➊
   4 Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters
   5 Repeat ➊ for a sphere
 */