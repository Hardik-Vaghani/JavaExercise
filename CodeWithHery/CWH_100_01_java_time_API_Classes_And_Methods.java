package CodeWithHery;
public class CWH_100_01_java_time_API_Classes_And_Methods {
}
/*
java.time API - Classes & Methods
    Date and time features in Java is primarily supported by two packages :

        java.util
        java.time
The package java.time was added with the release of Java 8 with the aim of solving problems faced by Java developers while handling date and time with java.util package such as representing a date without time, etc.

Classes of Java.time :
    Clock class:
        This class provides access to the current instant, date and time zone using a time-zone.
        Clock class is an abstract class therefore it is not possible to create instance of the clock class.
        Some methods of the clock class :
        abstract ZoneId getZone() : This methods returns the time zone being used to create date and time objects.
Example :
import java.time.*;
public class CWH extends Thread{
    public static void main(String[] args) {
        Clock cl = Clock.systemDefaultZone();
        System.out.println(cl.getZone());
    }
}
Output :Asia/Calcutta

abstract Instant instant() : This methods returns the current instant of the clocks.
Example :
import java.time.*;
public class CWH extends Thread{
    public static void main(String[] args) {
        Clock cl = Clock.systemUTC();

        System.out.println(cl.instant());
    }
}
Output :2021-05-26T06:43:05.064640700Z

2) Duration class :
    This class is used to measure time in seconds and nano seconds.
    This class is immutable.

   *) Some Methods of the duration class :
    1>boolean isNegative() : This method is used to check if the duration is negative.
Example :
import java.time.*;
public class CWH extends Thread{
    public static void main(String[] args) {
        Duration d1 = Duration.between(LocalTime.MIN,LocalTime.NOON);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '12:00'
                  System.out.println(d1.isNegative());

        Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'

        System.out.println(d2.isNegative());
    }
}
Output :false
        true

    2>isZero() : This method is used to check if the duration is zero. Returns boolean value.
Example :
import java.time.*;
public class CWH extends Thread{
    public static void main(String[] args) {
        Duration d1 = Duration.between(LocalTime.MIN,LocalTime.MIDNIGHT);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '00:00'
        System.out.println(d1.isZero());

        Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'

        System.out.println(d2.isZero());
    }
}
Output :true
        false

3) LocalDate class :
    This class is useful for representing the dates in the year-month-day format.
    With the help of LocalDate class, dates can be represented without time.
Example :
import java.time.*;
public class CWH extends Thread{
            public static void main(String[] args) {
                LocalDate d = LocalDate.now();
                System.out.println(d);
            }
}
Output :2021-05-26
Some methods of the LocalDate class :

    compareTo() : This method compares the equality of the two dates. Returns boolean value.
Example :
import java.time.*;
public class CWH extends Thread{
            public static void main(String[] args) {
                LocalDate d = LocalDate.parse("2021-05-27");
                LocalDate d1= LocalDate.parse("2021-05-26");
                LocalDate d2= LocalDate.parse("2021-05-26");

                System.out.println(d1.equals(d));
                System.out.println(d2.equals(d1));
            }
}
Output :false
        true

    withYear(int Year) : This method returns a copy of the LocaleDate but alters the year with the value of year passed as argument.
Example :
import java.time.*;
public class CWH extends Thread{
            public static void main(String[] args) {
                LocalDate d = LocalDate.parse("2021-05-27");
                System.out.println(d.withYear(2001));

            }
}
Output :2001-05-27


4) LocalTime class :
    This class helps us to represent the time without the dates.
    Instances of LocalTime class are mutable.
Example :
import java.time.*;
public class CWH extends Thread{
            public static void main(String[] args) {
                LocalTime t = LocalTime.now();
                System.out.println(t);

            }
}
Output :13:13:36.198479100

    Some methods of the LocalTime class :
    LocalTime plusHours(long hoursToAdd) : This method returns a copy of the LocalTime but with the specified number of hours added.
Example :
import java.time.*;
public class CWH extends Thread{
            public static void main(String[] args) {
                LocalTime t = LocalTime.of(13,18,29);
                System.out.println("Time before : "  + t);

                LocalTime t1= t.plusHours(5);
                System.out.println("Time after adding 5 hours : " + t1);

            }
}
Output : Time before : 13:18:29
         Time after adding 5 hours : 18:18:29

    LocalTime minusMinutes(long minutesToSubtract) : This method returns a copy of the LocalTime but with the specified number of minutes subtracted.
Example :
import java.time.*;
public class CWH extends Thread{
            public static void main(String[] args) {
                LocalTime t = LocalTime.of(15,28,19);
                System.out.println("Time before : "  + t);

                LocalTime t1= t.minusMinutes(8);
                System.out.println("Time after subtracting 8 minutes : " + t1);

            }
}
Output :Time before : 15:28:19
        Time after subtracting 8 minutes : 15:20:19


==> Code as described/written in the video :

package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class cwh_100_java_time {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}

































 */