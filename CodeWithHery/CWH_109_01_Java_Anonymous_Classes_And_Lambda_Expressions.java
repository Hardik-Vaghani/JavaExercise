package CodeWithHery;
public class CWH_109_01_Java_Anonymous_Classes_And_Lambda_Expressions {
}
/*
==> Java Anonymous Classes & Lambda Expressions
        Anonymous class is nothing but a class without any name.
        They are used to override a class method or interface.
        Anonymous classes in Java help us to write more concise and readable code.
Syntax :
// Demo can be interface or abstract class.
Demo t = new Demol()
{
   // data members and methods
   public void Demo_method()
   {
      ........
      ........
    }
};



How Anonymous class helps us to write concise code?
Take a look at the code given below :
@FunctionalInterface
interface Animal{
    void bark();
}

class Dog implements Animal{

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
}

class AnonDemo{
    public static void main(String[] args) {
        Dog Bruno = new Dog();
        Bruno.bark();
          }
}
    *) In the above example, Animal is a FunctionalInterface containing a bark() method inside it.
    *) Class Dog implements the Animal interface and overrides the bark() method.
    *) Bruno is an object of Dog class on which we are running the bark() method. Now, let's see the output of the above code :
Output :Dog barks!
     The same output can be generated without creating the Dog class. This is the scenario where the Anonymous class comes into the picture. With the help of the Anonymous class,
     we can declare and instantiate a class at the same time. Let's see how it is done :
@FunctionalInterface
interface Animal{
    void bark();
}

class AnonDemo{
    public static void main(String[] args) {
        Animal Bruno = new Animal() {
            @Override
            public void bark() {
                System.out.println("Dog barks!");
            }
        };
        Bruno.bark();
    }
}
In the above code, we've created the Bruno object by referencing the Animal interface. So, that's how we have overridden the bark() method without creating any separate class.




=> Ways to create an Anonymous Java class :
    The Anonymous class in Java can be created by two ways :

        By extending a class
        By implementing an interface
Let's take an example for both ways listed above.

*) By extending a class :
 abstract class Vehicle{
    abstract void drive();
}

class AnonDemoByClass{
    public static void main(String[] args) {
        Vehicle car = new Vehicle() {
            @Override
            void drive() {
                System.out.println("I'm driving a car.");
            }
        };
        car.drive();
        }
}
Output :I'm driving a car.


*) By implementing an interface :
@FunctionalInterface
interface Human{
    void walk();
}

class AnonDemo{
    public static void main(String[] args) {
        Human John = new Human() {
            @Override
            public void walk() {
                System.out.println("John walks.");
            }
        };
        John.walk();
    }
}
Output :John walks.




===>>> Lambda Expressions :
        Lambda expressions were introduced in Java 8.
        They are similar to methods, but they don't need a name.
Syntax :    (parameter1, parameter2) -> { code to be executed }

Take a look at the example given below :
@FunctionalInterface
interface LambaExp{
    void meth1(int a, int b);
}

class LambaExpDemo{
    public static void main(String[] args) {

        LambaExp obj =(a,b)->{
            System.out.println("The value of a and b is : "+ a + "," + b);
        };
        obj.meth1(5,10);
    }
}
Output :The value of a and b is : 5,10






package com.company;

@FunctionalInterface
interface DemoAno{
    void meth1(int a);
//    void meth2();
}

//
//class HarryFunc implements DemoAno{
//    @Override
//    public void meth1() {
//        System.out.println("This is method 1");
//    }
//}

//class AnonyDemo implements DemoAno{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("I am meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth2");
//    }
//}

public class cwh_109_lambda {
    public static void main(String[] args) {
//        DemoAno obj = new AnonyDemo();
//        obj.meth1();

        // Anonymous Class
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am meth2");
//            }
//        };
//        obj.meth1();

        // Lambda Expressions

//        DemoAno obj = new HarryFunc();
//        obj.meth1();
        DemoAno obj = (a)->{System.out.println("I am method 1 from this lambda " + a);};
        obj.meth1(6);
    }
}










 */