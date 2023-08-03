package Exercise.mathematics.recursionConvert;

import Temporary.ConsoleColors;

import java.text.DecimalFormat;
import java.util.Scanner;

import static Exercise.mathematics.recursionConvert.ConverterLakhFormat.convert;

public class UseThisTowClass {
    public static void main(String[] args) {

//        ConverterLakhFormat clf = new ConverterLakhFormat();
//        ConverterMillionFormat cmf = new ConverterMillionFormat();

        System.out.print(ConsoleColors.YELLOW + "Enter (decimal) number : ");
        String d = new Scanner(System.in).next();

        if (d != null) {
            DecimalFormat df = new DecimalFormat("#####.##");
//            Double decimal1 = Double.valueOf(df.format(d));

            String[] convert = d.split("\\.");

            String a = convert[0];
            String b = convert[1];

            System.out.println(a); // 13454
            System.out.println(b); // 92345
            System.out.println(d); // 13454.92345

            String upToNCharacters = b.substring(0, Math.min(b.length(), 2));
            System.out.println(upToNCharacters); // 92

            long aNum = Long.parseLong(a);
            long bNum = Long.parseLong(upToNCharacters); // b

            System.out.println(ConsoleColors.BLUE + "This is : " + ConsoleColors.GREEN_BOLD + convert(aNum) + ConsoleColors.BLUE_BRIGHT + " and " + ConsoleColors.GREEN_BOLD + convert(bNum) + " paisa");//Math.round((Double) d) //return long
            System.out.println(ConsoleColors.BLUE + "This is : " + ConsoleColors.RED_BOLD + convert(aNum) + ConsoleColors.PURPLE_BRIGHT + " and " + ConsoleColors.RED_BOLD + convert(bNum) + " cents");
//            System.out.println(ConsoleColors.RESET);

        }

       /* System.out.print(ConsoleColors.YELLOW + "Enter (without decimal) number : ");
        Object l = new Scanner(System.in).nextLong();

        if (l instanceof Long){
            Long num = (Long) l;
            System.out.println("" + ConsoleColors.BLUE + "This is : " + ConsoleColors.RED_BOLD + clf.convert(num) );
            System.out.println("" + ConsoleColors.BLUE + "This is : " + ConsoleColors.RED_BOLD + cmf.convert(num) );
            System.out.println(ConsoleColors.RESET);

        }*/

    }

}


//Math.round((Double) d) //return long
//        System.out.println(ConsoleColors.RED + "RED COLORED" + ConsoleColors.RESET + " NORMAL");
