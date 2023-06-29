package ApnaCollage.com.io.advance;

abstract class Animal {                                                 //abstract class karelche (Base Class)
    abstract void walk();                                                    //abstract function karel che
    void breathe() {
        System.out.println("This animal breathes air");
    }
    Animal() {
        System.out.println("You are about to create an Animal.");
    }
}
  
class Horse extends Animal {                                            //extend Base Class (Derived Class/Sub Class)
    Horse() {
        System.out.println("Wow, you have created a Horse!");
    }
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}
  
class Chicken extends Animal {                                          //extend Base Class (Derived Class/Sub Class)
    Chicken() {
        System.out.println("Wow, you have created a Chicken!");
    }
    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}
  
 public class Abstraction {
    public static void main(String args[]) {   
       Horse horse = new Horse();                       //objecte calling
       horse.walk();
       horse.breathe();
    }
}