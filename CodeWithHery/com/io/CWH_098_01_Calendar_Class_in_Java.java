package CodeWithHery.com.io;
public class CWH_098_01_Calendar_Class_in_Java {
}
/*
==> Calendar Class in Java
    The calendar class in java provides the methods that helps in converting date between a specific instant in time.
    It is an abstract class.
    Since it is an abstract class, we can not create an instance of this class with the help of a constructor.
    We use the static method Calender.getInstance() in order to implement a sub-class.
Example to demonstrate the getInstance() method :
import java.util.*;
public class CWH extends Thread{
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());  //getCalendarType() returns the type of the calendar

    }
}
Output :gregory


*) Constructors of the Calendar class :
        1)Calendar(): This constructor is used to construct a calendar with the default time zone & locale.
        2)Calendar(Time zone, Locale locale): This constructor is used to construct a calendar with the specified time zone & locale.

*) Methods of the Calendar class :
        1)get(int field) :
            This method returns the value of the specified calendar field.
Example :
import java.util.*;
public class CWH extends Thread{
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current year is :"+ c.get(Calendar.YEAR));
        System.out.println("Current month is :"+ c.get(Calendar.MONTH)); //The indexing for month field ranges from [0,11]
        System.out.println("Current day is :"+ c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current hour is :"+ c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current minute is :"+ c.get(Calendar.MINUTE));
        System.out.println("Current second is :"+ c.get(Calendar.SECOND));


    }
}
 Output :Current year is :2021
         Current month is :4
         Current day is :1
         Current hour is :12
         Current minute is :3
         Current second is :3

2) add(int field, int amount) :
        This method is useful for calculating the time after or before of a specified calendar field.
Example :import java.util.*;
public class CWH extends Thread{
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current date is : " + c.getTime());
        c.add(Calendar.YEAR, 4);
        System.out.println("After 4 years  : "+ c.getTime());
        c.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years  : "+ c.getTime());
        c.add(Calendar.MONTH,2);
        System.out.println("After 2 months  : "+ c.getTime());

    }
}
Output :Current date is : Sun May 23 12:14:24 IST 2021
        After 4 years  : Fri May 23 12:14:24 IST 2025
        Before 12 years  : Thu May 23 12:14:24 IST 2013
        After 2 months  : Tue Jul 23 12:14:24 IST 2013

3) getWeeksInWeekYear() :
        Returns the number of weeks.
Example
import java.util.*;
public class CWH extends Thread{
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getWeeksInWeekYear());
    }
}
Output :52

4) getMaximum(int field) :
     Returns the maximum value for the specified calendar field.
Example :
 import java.util.*;
public class CWH extends Thread{
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(" The maximum no. of weeks in a year : " + c.getMaximum(Calendar.WEEK_OF_YEAR));


    }
}
Output :53



 */