package CodeWithHery.com.io;
public class CWH_101_01_DateTimeFormatter_in_Java {
}
/*
==> DateTimeFormatter in Java
        This class helps us to print and parse date and time in our desired format.
        The format() method of the DateTimeFormatter class is used to format the dates using our desired format.
Syntax : public String format(DateTimeFormatter formatter)

Parameter :
    The object of the formatter to be used is passed, and it can not be null.
Exception :
    This method throws DateTimeException.
Return Value :
    Returns the string in the format specified by the user.
Example :
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH extends Thread{
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("The current date is : " + dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // This is the format

        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println("Date after formattin : "+ myDate);

    }
}
Output :The current date is : 2021-05-26T18:15:42.554864400
        Date after formattin : 26.05.2021
In addition to the format, formatters can be created with desired Locale, Chronology, ZoneId, and DecimalStyle.


=> Programs to illustrate some of the predefined formatters of the DateTimeFormatter class :
        1) ISO_LOCAL_DATE :
            Formats the date according to the International Standard for the representation of dates.
Example :
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH extends Thread{
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;// Formatting the date in the ISO format

        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println("Date in ISO format : "+ myDate);

    }
}
Output :Date in ISO format : 2021-05-26


        2) ISO_WEEK_DATE :
                Returns the number of weeks and year.
Example :
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH extends Thread{
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ISO_WEEK_DATE;//

        String myDate = dt.format(df);
        System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate);

    }
}
Output :Date in ISO_WEEK_DATE Format  : 2021-W21-3


        3)ISO_ORDINAL_DATE :
            Returns the year and day of the year.
Example :
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH extends Thread{
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ISO_ORDINAL_DATE;//

        String myDate = dt.format(df);
        System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate);

    }
}
Output :Date in ISO_ORDINAL_DATE Format  : 2021-146


==> Patterns for formatting and parsing :
      Pattern letters for all the alphabets(capital as well as small) are defined as follows :

 Symbol  Meaning                     Presentation      Examples
  ------  -------                     ------------      -------
   G       era                         text              AD; Anno Domini; A
   u       year                        year              2004; 04
   y       year-of-era                 year              2004; 04
   D       day-of-year                 number            189
   M/L     month-of-year               number/text       7; 07; Jul; July; J
   d       day-of-month                number            10

   Q/q     quarter-of-year             number/text       3; 03; Q3; 3rd quarter
   Y       week-based-year             year              1996; 96
   w       week-of-week-based-year     number            27
   W       week-of-month               number            4
   E       day-of-week                 text              Tue; Tuesday; T
   e/c     localized day-of-week       number/text       2; 02; Tue; Tuesday; T
   F       week-of-month               number            3

   a       am-pm-of-day                text              PM
   h       clock-hour-of-am-pm (1-12)  number            12
   K       hour-of-am-pm (0-11)        number            0
   k       clock-hour-of-am-pm (1-24)  number            0

   H       hour-of-day (0-23)          number            0
   m       minute-of-hour              number            30
   s       second-of-minute            number            55
   S       fraction-of-second          fraction          978
   A       milli-of-day                number            1234
   n       nano-of-second              number            987654321
   N       nano-of-day                 number            1234000000

   V       time-zone ID                zone-id           America/Los_Angeles; Z; -08:30
   z       time-zone name              zone-name         Pacific Standard Time; PST
   O       localized zone-offset       offset-O          GMT+8; GMT+08:00; UTC-08:00;
   X       zone-offset 'Z' for zero    offset-X          Z; -08; -0830; -08:30; -083015; -08:30:15;
   x       zone-offset                 offset-x          +0000; -08; -0830; -08:30; -083015; -08:30:15;
   Z       zone-offset                 offset-Z          +0000; -0800; -08:00;

   p       pad next                    pad modifier      1

   '       escape for text             delimiter
   ''      single quote                literal           '
   [       optional section start
   ]       optional section end
   #       reserved for future use
   {       reserved for future use
   }       reserved for future use




Code as described/written in the video :


package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); // This is the format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println(myDate);

    }
}

















































































 */