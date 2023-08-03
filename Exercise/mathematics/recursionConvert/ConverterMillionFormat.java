
package Exercise.mathematics.recursionConvert;

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
            long remainder = number % 10;
            long tens = number - remainder;
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

        long remainder = number % (long) Math.pow(10, mostSignificantPower);
        long powerDigit = number / (long) Math.pow(10, mostSignificantPower);
        return (convertRecursion(powerDigit, false) + " " + mostSignificantPowerSuffix + " " + convertRecursion(remainder, false)).trim();
    }

    private static void prepareDirectMappings() {
        if (directMappings == null) {
            directMappings = new HashMap<>();
            directMappings.put(0L, "");
            directMappings.put(1L, "One");
            directMappings.put(2L, "Two");
            directMappings.put(3L, "Three");
            directMappings.put(4L, "Four");
            directMappings.put(5L, "Five");
            directMappings.put(6L, "Six");
            directMappings.put(7L, "Seven");
            directMappings.put(8L, "Eight");
            directMappings.put(9L, "Nine");
            directMappings.put(10L, "Ten");
            directMappings.put(11L, "Eleven");
            directMappings.put(12L, "Twelve");
            directMappings.put(13L, "Thirteen");
            directMappings.put(14L, "Fourteen");
            directMappings.put(15L, "Fifteen");
            directMappings.put(16L, "Sixteen");
            directMappings.put(17L, "Seventeen");
            directMappings.put(18L, "Eighteen");
            directMappings.put(19L, "Nineteen");
            directMappings.put(20L, "Twenty");
            directMappings.put(30L, "Thirty");
            directMappings.put(40L, "Fourty");
            directMappings.put(50L, "Fifty");
            directMappings.put(60L, "Sixty");
            directMappings.put(70L, "Seventy");
            directMappings.put(80L, "Eighty");
            directMappings.put(90L, "Ninety");
        }
    }

    private static void preparePowerList() {
        if (powersList == null) {
            powersList = new ArrayList<>();
            powersList.add(new PowerName(2L, "Hundred"));
            powersList.add(new PowerName(3L, "Thousand"));
            powersList.add(new PowerName(6L, "Million"));
            powersList.add(new PowerName(9L, "Billion"));
            powersList.add(new PowerName(12L, "Trillion"));
            powersList.add(new PowerName(15L, "Quadrillion"));
            powersList.add(new PowerName(18L, "Quintillion"));
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