
package Exercise.com.io.mathematics.recursionConvert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConverterMillionFormat {
    static ArrayList<PowerName> powersList = null;
    static Map<Long, String> directMappings = null;

    public static String convert(long number) {
        prepareDirectMappings();
        preparePowerList();

        if (number < 0) {
            String raw = convertRecursion(Math.abs(number), true);
            return "Minus ".concat(raw);
        } else {
            return convertRecursion(number, true);

        }
    }

    private static String convertRecursion(long number, Boolean isInitialIteration) {
        if (number == 0 && isInitialIteration) {
            return "Zero";
        }

        if (directMappings.containsKey(number)) {
            return directMappings.get(number);
        }

        if (number < 100) {
            long remainder = (long) (number % 10);
            long tens = (long) (number - remainder);
            return (convertRecursion(tens, false) + " " + convertRecursion(remainder, false)).trim();
        }

        long mostSignificantPower = 2;
        String mostSignificantPowerSuffix = "";
        for (PowerName power : powersList) {
            if (number / (long) Math.pow(10, power.powerValue) == 0) {
                break;
            } else {
                mostSignificantPower = power.powerValue;
                mostSignificantPowerSuffix = power.suffix;
            }
        }

        long remainder = (long) (number % (long) Math.pow(10, mostSignificantPower));
        long powerDigit = (long) (number / (long) Math.pow(10, mostSignificantPower));
        return (convertRecursion((long) powerDigit, false) + " " + mostSignificantPowerSuffix + " " + convertRecursion((long) remainder, false)).trim();
    }

    private static void prepareDirectMappings() {
        if (directMappings == null) {
            directMappings = new HashMap<>();
            directMappings.put(0l, "");
            directMappings.put(1l, "One");
            directMappings.put(2l, "Two");
            directMappings.put(3l, "Three");
            directMappings.put(4l, "Four");
            directMappings.put(5l, "Five");
            directMappings.put(6l, "Six");
            directMappings.put(7l, "Seven");
            directMappings.put(8l, "Eight");
            directMappings.put(9l, "Nine");
            directMappings.put(10l, "Ten");
            directMappings.put(11l, "Eleven");
            directMappings.put(12l, "Twelve");
            directMappings.put(13l, "Thirteen");
            directMappings.put(14l, "Fourteen");
            directMappings.put(15l, "Fifteen");
            directMappings.put(16l, "Sixteen");
            directMappings.put(17l, "Seventeen");
            directMappings.put(18l, "Eighteen");
            directMappings.put(19l, "Nineteen");
            directMappings.put(20l, "Twenty");
            directMappings.put(30l, "Thirty");
            directMappings.put(40l, "Fourty");
            directMappings.put(50l, "Fifty");
            directMappings.put(60l, "Sixty");
            directMappings.put(70l, "Seventy");
            directMappings.put(80l, "Eighty");
            directMappings.put(90l, "Ninety");
        }
    }

    private static void preparePowerList() {
        if (powersList == null) {
            powersList = new ArrayList<>();
            powersList.add(new PowerName(2l, "Hundred"));
            powersList.add(new PowerName(3l, "Thousand"));
            powersList.add(new PowerName(6l, "Million"));
            powersList.add(new PowerName(9l, "Billion"));
            powersList.add(new PowerName(12l, "Trillion"));
            powersList.add(new PowerName(15l, "Quadrillion"));
            powersList.add(new PowerName(18l, "Quintillion"));
            //trillion,quadrillion,quintillion
        }
    }

    static class PowerName {
        long powerValue;
        String suffix;

        public PowerName(long powerValue, String suffix) {
            this.powerValue = powerValue;
            this.suffix = suffix;
        }
    }
}