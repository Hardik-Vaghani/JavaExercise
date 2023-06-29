package CodeWithHery.com.io;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){  // <- non Paramerterized constructor
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){  // <- Paramerterized constructor
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){   // <- Paramerterized constructor
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id = i;
    }
}

public class CWH_042_01_Constructors_overload {
    public static void main(String[] args) {
        //MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
        MyMainEmployee harry = new MyMainEmployee();
        //harry.setName("CodeWithHarry");
        //harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
/*
==> Constructor Overloading
class Employee {
// First constructor
            Employee(String s, int i){
                System.out.println("The name of the first employee is : " + s);
                System.out.println("The id of the first employee is : " + i);
            }
        //    Constructor overloaded
            Employee(String s, int i, int salary){
                System.out.println("The name of the second employee is : " + s);
                System.out.println("The id of the second employee is : " + i);
                System.out.println("The salary of second employee is : " + salary);
            }

        }
        public class CWH_constructors {
            public static void main(String[] args) {
                Employee shubham = new Employee("Shubham",1);
                Employee harry = new Employee("Harry",2,70000);



            }
        }
Output :
        The name of the first employee is : Shubham
        The id of the first employee is : 1
        The name of the second employee is : Harry
        The id of the second employee is : 2
        The salary of second employee is : 70000
 */