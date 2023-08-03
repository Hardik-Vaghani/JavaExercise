package CodeWithHery;
import java.util.Scanner;

public class CWH_086_01_Practice_Set_on_Errors_And_Exceptions {
    public static void main(String[] args) {
        // Problem 1
        // Syntax Error - int a = 7
        int age = 78;
        int year_born = 2000-78; // Logical error
//        System.out.println(6/0);

        // Problem 2
        try{
            int a = 666/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }

        // Problem 3
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner Sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5){
            try {
                System.out.println("Enter the value of index");
                index = Sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }


    }
}
/*
Chapter- 14 - Practice set
1) Write a java program to demonstrate syntax, logical 2 runtime errors.

2) Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.

3) Write a program that allows you to given. If max retries exceed 5 print "errors".

4) Modify program in Q3 to throw a custom Exception if max retries are reached.

5) Wrap the program in Q3 inside a method which throws your custom Exception.


For Question 4 ->
Make a custom class for the error ->
class Exceptiononretry extends Exception{
    @Override
    public String getMessage(){
        return "Error";
    }

}

In the main function->
if(i>=5){
                try{
                    throw new Exceptiononretry();
                }
                catch(Exceptiononretry e){
                    System.out.println("\n"+e.getMessage());
                }
            }

For question 5 ->
Using the above custom class make this function->
public static void throwexception(int i) throws Exceptiononretry{
        if (i<=5){
            throw new Exceptiononretry();
        }
    }

In the main function ->
if(i>=5){
                try{
                    throwexception(i);
                }
                catch(Exceptiononretry e){
                    System.out.println("\n"+e.getMessage());
                }
            }

 */