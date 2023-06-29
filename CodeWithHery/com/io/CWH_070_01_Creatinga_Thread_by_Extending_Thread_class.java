package CodeWithHery.com.io;
class MyThread extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

public class CWH_070_01_Creatinga_Thread_by_Extending_Thread_class {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
/*

Multithreading In Java :
    *) Used to maximize the CPU utilization.
    *) We don't want our CPU to be in a free state; for example, Func1() comes into the memory and demands any input/output process. The CPU will need to wait for unit Func1() to complete its input/output operation in such a condition. But, while Func1() completes its I/O operation, the CPU is free and not executing any thread. So, the efficiency of the CPU is decreased in the absence of multithreading.
    *) In the case of multithreading, if a thread demands any I/O operation, then the CPU will let the thread perform its I/O operation, but it will start the execution of a new thread parallelly. So, in this case, two threads are executing at the same time.

Flow Of Control In Java :
      1. Without threading :
  In the above image, you can see that Func1() and Func2() are called inside the main() function. But the execution of Func2() will start only after the completion of the Func1().

      2. With threading :
 Again, Func1() and Func2() are called inside the main function, but none of the two functions is waiting for the execution of the other function. Both the functions are getting executed concurrently.

 Ways To Create A Thread In Java
*)  By extending the thread class
*)  By implementing Runnable interface

Let's see how we can create a thread by extending the thread class.

Extending Thread Class :
    *)  To create a thread using the thread class, we need to extend the thread class. Java's multithreading system is based on the thread class
 */