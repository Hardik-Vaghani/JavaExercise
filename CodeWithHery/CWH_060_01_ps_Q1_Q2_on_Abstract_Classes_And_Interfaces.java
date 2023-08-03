package CodeWithHery;
abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}

public class CWH_060_01_ps_Q1_Q2_on_Abstract_Classes_And_Interfaces {
    public static void main(String[] args) {
        // Q1 + Q2
        FountainPen pen = new FountainPen();
        pen.changeNib();


    }
}

/*
Create an abstract class pen with methods write () and refill () as abstract methods
Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
Create a class monkey with jump ( ) and bite ( ) methods Create a class human whichinherits this monkey class and implements basicanimal interface with eat ( ) and sleep methods
Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism
Demonstrate polymorphism using using monkey  class from Q3
Create an interface TVremote and use it to inherit another interface smart TVremote
Create a class TV which implements TVremote interface from Q6
 */