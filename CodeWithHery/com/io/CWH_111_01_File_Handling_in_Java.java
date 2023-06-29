package CodeWithHery.com.io;
public class CWH_111_01_File_Handling_in_Java {
}
/*
==>. File Handling in Java
        File handling is a crucial part of any programming language.
        In Java, file handling is done with the help of the File class of the java.io package.

Common file handling operations :
   1 Creating a new file.
   2 Writing in a file.
   3 Reading an existing file.
   4 Deleting a file.
To perform any of the above operations on a file in Java, we need to create an object of the File class as shown in the below code:

import java.io.File;  // Importing the File class
File obj = new File("filename.txt"); // Specify the name of the file

Now, let's see how we can perform the above operation on a file in Java.


1) Creating a new file :
createNewFile() method is used to create a new file. Take a look at the below example :
import java.io.File;
import java.io.FileWriter;

public class CWH {
    public static void main(String[] args) {

        File myFile = new File("CWH_file1.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
Output :File created successfully.

2) Writing to a file :
    FileWriter class is used with its write() method to write some content in a file.
    Do not forget to use the close() method when you're finished writing to a file. Take a look at the below example
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CWH {
    public static void main(String[] args) {

        File myFile = new File("CWH_file1.txt");
        try {
            FileWriter fileWriter = new FileWriter("CWH_file1.txt");
            fileWriter.write("CodeWithHarry is one step solution for your all programming problems.\nKeep learning, Keep coding!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
Output of the CWH_file1.txt :  CodeWithHarry is one step solution for your all programming problems.
                               Keep learning, Keep coding!


3) Reading a file :
    The Scanner class is used to read a file.
    It is important to enclose the method in a try-catch block to handle the IOException.
Example :
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CWH {
    public static void main(String[] args) {

        File myFile = new File("CWH_file1.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
Output : CodeWithHarry is one step solution for your all programming problems.
         Keep learning, Keep coding!


4) Deleting a file :
        The delete() method is used to delete a file in Java.
Example :
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CWH {
    public static void main(String[] args) {

        File myFile = new File("CWH_file1.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }

    }

}
Output :I have deleted: CWH_file1.txt

*/

//Code as described/written in the video :
//package com.company;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class cwh_111_file {
//    public static void main(String[] args) {

        // Code to create a new file
        /*
        File myFile = new File("cwh111file.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }


        // Code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("cwh111file.txt");
            fileWriter.write("This is our first file from this java course\nOkay now bye");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading a file
        File myFile = new File("cwh111file.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */
// Deleting a file
//File myFile = new File("cwh111file.txt");
//        if(myFile.delete()){
//                System.out.println("I have deleted: " + myFile.getName());
//                }
//                else{
//                System.out.println("Some problem occurred while deleting the file");
//                }
//
//                }
//                }




























