package CodeWithHery.com.io;

public class CWH_002_01_Hello_World {
    	// Entrypoint into the application
        public static void main(String[]args){
            System.out.println("Hello World");
        }
}
/*
Working of the "Hello World" program shown above :

package com.company :
    Packages are used to group the related classes.
    The "Package" keyword is used to create packages in Java.
    Here, com.company is the name of our package.

public class Main :
    In Java, every program must contain a class.
    The filename and name of the class should be the same.
    Here, we've created a class named "Main".
    It is the entry point to the application.

public static void main(String[]args){..} :
    This is the main() method of our Java program.
    Every Java program must contain the main() method.


System.out.println("Hello World"):
    The above code is used to display the output on the screen.
    Anything passed inside the inverted commas is printed on the screen as plain text.

Naming Conventions
    For classes, we use Pascal Convention. The first and Subsequent characters from a word are capital letters (uppercase).
    Example: Main, MyScanner, MyEmployee, CodeWithHarry
    For functions and variables, we use camelCaseConvention. Here the first character is lowercase, and the subsequent characters are uppercase like myScanner, myMarks, CodeWithHarry
     */