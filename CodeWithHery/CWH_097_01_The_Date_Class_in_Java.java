package CodeWithHery;
public class CWH_097_01_The_Date_Class_in_Java {
}
  /*
    Answer of quiz asked in the previous tutorial:

        Question: Is it safe to store the number of milliseconds in a variable of type long?
        Answer: Yes, it is absolutely safe to store the number of milliseconds in a variable of type long because the maximum value that can be stored in long is 9223372036854775807. You can see that the maximum value of long is huge. Therefore, we do not need to worry about the value of milliseconds. Notice the output of the below code; the value of current time in millisecond is 10^6 times smaller than the maximum value of long data type.

        Example :
        import java.util.*;
public class CWH extends Thread{
    public static void main(String[] args) {
        System.out.println("The maximum value of long is :" + Long.MAX_VALUE);
        System.out.println("The value of current time in ms : " + System.currentTimeMillis());
    }
}
Output :The maximum value of long is :9223372036854775807
        The value of current time in ms : 1621708466975


*) Date Class In Java :
    Date class in java is available in java.util package.
    This class provides the instant in time with precision of millisecond.

*) Constructors of the date class :
    Date(): This constructor is used when we need an object of current date and time.
    Date(long milliseconds): This constructor creates a date object from the number of milliseconds passed since January 1, 1970.
Example :
import java.util.*;
public class CWH extends Thread{
    public static void main(String[] args) {
        Date d= new Date();
        System.out.println("The current date is : " + d);

        Date d1= new Date(1621709639111l);
        System.out.println("The date calculated form miliseconds is : " + d1);

    }
}
Output :The current date is : Sun May 23 00:24:17 IST 2021
        The date calculated form miliseconds is : Sun May 23 00:23:59 IST 2021


        Methods of date class :
1) compareTo() :
    Checks for the equality of the two dates.
    Returns 0 if the dates are equal; else, returns 1.
Example :
import java.util.*;
public class CWH extends Thread{
    public static void main(String[] args) {
        Date d= new Date();

        Date d1= new Date(2021,12, 24);  //both dates are different
        System.out.println(d1.compareTo(d));

    }
}
Output :1

2) getTime() :
    This method returns the number of milliseconds passed since the midnight of January 1, 1970.
Example :
import java.util.*;
public class CWH extends Thread{
    public static void main(String[] args) {
        Date d= new Date(2021,5,23);

        System.out.println("The number of milliseonds passed since Jan 1, 1970 :" +d.getTime() );

    }
}
Output : The number of milliseonds passed since Jan 1, 1970 :61582530600000

3) getYear() : Prints the current year.
    getDate() : Prints the current date.
Example :
import java.util.*;
public class CWH extends Thread{
    public static void main(String[] args) {
        Date d= new Date();
        System.out.println("The current date is : "+ d.getDate());
        System.out.println("The current year is : "+ d.getYear()); //19

    }
}
Output :The current date is : 23
        The current year is : 121


Code as described/written in the video :
package com.company;

import java.util.Date;
public class cwh_97_date_class {
    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
    }
}



   */