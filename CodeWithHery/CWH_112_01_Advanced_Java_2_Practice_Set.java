package CodeWithHery;
public class CWH_112_01_Advanced_Java_2_Practice_Set {
}
/*
Question 1: Create a class and a method with deprecated annotation. What is its effect on program execution?
Answer 1: We discussed the deprecated annotation in Annotations in Java tutorial. Below is the required program :
class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}

public class CWH {
    public static void main(String[] args) {
        MyDeprecated d = new MyDeprecated();
        d.meth1();
    }
}
Output :I am method 1
There is no as such special effect on the program of deprecated annotation. The only thing is that compiler generated a waning if we use deprecated method or class in our program.


Question 2: Suppress the warning generated in question number 2.
Answer 2: We saw how compiler-generated warnings could be suppressed by using @SuppressWarnings annotation. The required program is given below:
class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}

public class CWH {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        MyDeprecated d = new MyDeprecated();
        d.meth1();
    }
}


Question 3: Create an interface and generate an instance from it.
Answer 3:
interface MyInt{
    void display();
}

public class CWH {
    public static void main(String[] args) {
        MyInt i = () -> System.out.println("I am display");
        i.display();
    }
}
Output :I am display



Question 4: Write a Java program to generate a multiplication table of a given number and write it to a file.
Answer 4: The following program saves the multiplication table of 19 into a file named "MultiplicationTable.txt".
import java.io.FileWriter;
import java.io.IOException;

public class CWH {
    public static void main(String[] args) {
        int i = 19;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X"+(j+1) + "=" + i*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


===>>>Code as described/written in the video :
package com.company;

import java.io.FileWriter;
import java.io.IOException;

class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}

interface MyInt{
    void display();
}

public class cwh_112 {

    public static void main(String[] args) {
//        MyDeprecated d = new MyDeprecated();
//        d.meth1();
//        MyInt i = () -> System.out.println("I am display");

        int i = 19;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X"+(j+1) + "=" + i*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}






































































 */