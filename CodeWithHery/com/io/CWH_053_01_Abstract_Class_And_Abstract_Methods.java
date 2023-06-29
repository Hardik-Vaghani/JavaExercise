package CodeWithHery.com.io;
abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class CWH_053_01_Abstract_Class_And_Abstract_Methods {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); -- error
        Child2 c = new Child2();
        //Child3 c3 = new Child3(); -- error
    }
}
/*
What does Abstract mean?

    Abstract in English means existing in through or as an idea without concrete existence.

Abstract class :
    An abstract class cannot be instantiated.
    Java requires us to extend it if we want to access it.
     It can include abstract and non-abstract methods.
    If a class includes abstract methods, then the class itself must be declared abstract, as in

NOTE: Abstract class are used when we want to achieve security & abstraction(hide certain details & show only necessary details to the user)

Abstract method :
    A method that is declared without implementation is known as the abstract method.
    An abstract method can only be used inside an abstract class.
    The body of the abstract method is provided by the class that inherits the abstract class in which the abstract method is present.
    In the above example, on() is the abstract method.

 */