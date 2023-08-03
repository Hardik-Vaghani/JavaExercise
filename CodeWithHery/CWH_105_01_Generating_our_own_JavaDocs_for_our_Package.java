package CodeWithHery;
public class CWH_105_01_Generating_our_own_JavaDocs_for_our_Package {
}
/*
 A reliable documentation is a must for a developer. Just imagine how difficult it would be to write code in a language you are not familiar with, without proper documentation. Documentation helps us to develop, maintain and transfer knowledge to other developers. As you are already aware that there is a proper documentation available for Java. But have you ever thought of creating your own documentation? In this tutorial, I will tell you how you can automatically generate documentation for your Java packages with the help of JavaDoc.

What is JavaDoc?
    It is a tool that automatically generates standard documentation in HTML format from the Java source code.
    This tool comes built-in with JDK( Java Development Kit).
Steps to create documentation with JavaDoc in IntellijIdea :
    Open your java program in IntellijIdea.
    Click on Tools and then select Generate JavaDoc.
    JavaDoc guide
    A pop window will open. Select the project and packages for which you want to create the JavaDoc.
    Select the classes for which you want to generate the documentation. By default, documentation will be created for all the classes.
    Select the location where you want to save your JavaDoc by clicking on the Output directory.
    Click on Ok, and your documentation will be saved to your specified location.



 package com.company;

public class cwh_105_javadoc {
        static void foo(){
            System.out.println("Good Morning bro!");
        }

        static void foo(int a){
            System.out.println("Good morning " + a + " bro!");
        }

        static void foo(int a, int b){
            System.out.println("Good morning " + a + " bro!");
            System.out.println("Good morning " + b + " bro!");
        }

        static void foo(int a, int b, int c){
            System.out.println("Good morning " + a + " bro!");
            System.out.println("Good morning " + b + " bro!");
        }

        static void change(int a){
            a = 98;
        }

        static void change2(int [] arr){
            arr[0] = 98;
        }
        static void tellJoke(){
            System.out.println("I invented a new word!\n" +
                    "Plagiarism!");
        }

        public static void main(String[] args) {
            // tellJoke();

            // Case 1: Changing the Integer
            //int x = 45;
            //change(x);
            //System.out.println("The value of x after running change is: " + x);

            // Case 1: Changing the Array
            // int [] marks = {52, 73, 77, 89, 98, 94};
            // change2(marks);
            // System.out.println("The value of x after running change is: " + marks[0]);


            // Method Overloading
            foo();
            foo(3000);
            foo(3000, 4000);
            // Arguments are actual!


        }

}



















 */