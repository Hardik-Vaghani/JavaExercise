package CodeWithHery;

class Employee1{                           // Problem 1
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{                         // Problem 2
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }

}

class Square{                            // Problem 3
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

                                            //problem 4
class Rectangle{ int Length; int Width;
    public int area () {
        System.out.println("Area is");
        return 	Length*Width;}


    public int perimeter() {
        System.out.println("perimeter is");
        return 2*(Length+Width);
    }


}


class Tommy{                                    // Problem 5
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

                                                // Problem 6

class Circle{
    double radius;

    public double area(){
        return 3.14*radius*radius;
    }
    public double peimeter(){
        return 2*3.14*radius;
    }
}



public class CWH_039_01_Ch_8_Practice_Set_Basic_Questions_on_OOP {
    public static void main(String[] args) {

        // Problem 1
        Employee1 harry = new Employee1();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

        // Problem 2
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        //asus.ring();


        // Problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());


        //problem 4

        Rectangle rc = new Rectangle();
        rc.Length = 4;
        rc.Width = 2;
        System.out.println(rc.area());
        System.out.println(rc.perimeter());


        // Problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();



        // Problem 6
        Circle ci = new Circle();
        ci.radius =4;
        System.out.println(ci.area());
        System.out.println(ci.peimeter());


    }


}

/*
    1) Create a class Employee with the following properties and methods:
       *) Salary (property) (int)
       *) getSalary (method returning int)
       *) name (property) (String)
       *) getName (method returning String)
       *) setName (method changing name)
    2) Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
    3) Create a class Square with a method to initialize its side, calculating area, perimeter etc.
    4) Create a class Rectangle & problem 3.
    5) Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
    6) Repeat problem 4 for a circle.
     */