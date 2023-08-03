package CodeWithHery;
public class CWH_076_01_Java_Tutorial_Practice_Questions_on_Thread {
}
/*
Question 1: Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.

Answer 1:
import java.util.ArrayList;

class Thread1 extends Thread{
    public void run(){
        while (true){
        System.out.println("Welcome");
    }
    }
}
class Thread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good morning");
        }
    }
}
public class CWH {
    public static void main(String[] args) {
        Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();
        t1.start();
        t2.start();
    }
}
 */

/*
Question 2: Add a step method in the welcome thread of question 1 to delay its execution for 200ms.

Answer 2:
import java.util.ArrayList;

class Thread1 extends Thread{
    public void run(){
        try {
            Thread.sleep(200);
    }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome");
    }
}
class Thread2 extends Thread {
    public void run() {
            System.out.println("Good morning");
        }
    }
public class CWH {
    public static void main(String[] args) {
        Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();
        t1.start();
        t2.start();
    }
}
 */

/*
Question 3: Demonstrate gerPriority() and setPriority() methods in Java threads.

Answer 3:
import java.util.ArrayList;

class Thread1 extends Thread{
    public void run(){
        System.out.println("Welcome");
    }
}
class Thread2 extends Thread {
    public void run() {
            System.out.println("Good morning");
        }
    }
public class CWH {
    public static void main(String[] args) {
        Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();
        t1.start();
        t2.start();
        t1.setPriority(5);
        t2.setPriority(1);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
 */
/*
Question 4: How do you get the state of a given thread in Java?

Answer 4: getState() method is used to get the state of a given thread in Java.

Question 5: How do you get the reference to the current thread in Java?

Answer 5: currentThread() method is used to reference the current thread in Java.

Code as described/written in the video :
package com.company;

class Practice13 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning!");
        }
    }
}
class Practice13b extends Thread{
    public void run(){
//        while(false){
//            try {
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Welcome");
//        }
    }
}

public class cwh_76_practice13 {
    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
        // p1.setPriority(6);
        // p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
//        p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}

 */