package CodeWithHery.com.io;
class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class CWH_049_01_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone(); // Allowed
        // SmartPhone smobj = new SmartPhone(); // Allowed
        // obj.name();

        Phone obj = new SmartPhone(); // Yes it is allowed
        // SmartPhone obj2 = new Phone(); // Not allowed

        obj.showTime();
        obj.on();
//        obj.music(); Not Allowed


    }
}
//Note: The data members can not achieve the run time polymorphism.
/*
Example to demonstrate the use of Dynamic method dispatch :

    *) In the below code, we've created two classes: Phone & SmartPhone.
    *) The Phone is the parent class and the SmartPhone is the child class.
    *) The method on() of the parent class is overridden inside the child class.
    *) Inside the main() method, we've created an object obj of the Smartphone() class by taking the reference of the Phone() class.
    *) When obj.on() will be executed, it will call the on() method of the SmartPhone() class because the reference variable obj is pointing towards the object of class SmartPhone().
 */