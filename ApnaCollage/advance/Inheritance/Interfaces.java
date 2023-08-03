package ApnaCollage.advance.Inheritance;

interface Animal {                                                          //interface Base Class(Pure Abstraction) karel che
    void walk();
}
  
class Horse implements Animal {                                              //implement Base Class (Derived Class/Sub Class)karel che
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}
  
class Chicken implements Animal {                                            //implement Base Class (Derived Class/Sub Class)karel che
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}                                                                                        /*/Multiple Inheritance /Inter Face/*/
  
 public class Interfaces {
    public static void main(String[] args) {
       Horse horse = new Horse();
       horse.walk();
    }
}
