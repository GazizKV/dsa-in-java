

//  author:  ValitovGaziz
//  date:    12.01.2022
//  project: dsa-in-java

import java.util.Calendar;
import java.util.Map;
import java.util.Random;

public class Functions {

    private static final Random random = new Random();

    public static void swapValues(int[] array, int x, int y) {
        int swap;
        swap = array[y];
        array[y] = array[x];
        array[x] = swap;
    }

    public static int minVal(int[] array, int from, int to) {
        int result = Integer.MAX_VALUE;
        int resultIndex = 0;
        for (int i = from; i < to; i++) {
            if (result > array[i]) {
                result = array[i];
                resultIndex = i;
            }
        }
        return resultIndex;
    }

    public static void printArray(int[] array) {
        int arrayLength = array.length;
        if (array.length < 51) {
            for (int j : array) {
                System.out.print(j + " ");
            }
            System.out.println("\nArray length equal to " + array.length);
        } else {
            for (int i = 0; i < 10; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("\nNumber of values equal to " + array.length);
            // Print last 10 values from integers array
            for (int i = 0; i < 10; i++) {
                System.out.print(array[arrayLength - 1 - i] + " ");
            }
            System.out.print("\n");
        }
    }

    public static boolean checkSortedArray(int[] array) {
        boolean result = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                result = false;
                System.out.printf("Index/value %d/%d\n", i, array[i]);
                break;
            }
        }
        return result;
    }


    public static int[] generate(int length) {
        int[] randomIntegersArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomIntegersArray[i] = random.nextInt();
        }
        return randomIntegersArray;
    }

    public static int[] generate(int length, int rangeFrom, int rangeTo) {

        if ((rangeTo - rangeFrom) < 2) {
            throw new IllegalArgumentException("Range is too low.");
        }
        int[] randomIntegersArray = new int[length];

        int range = rangeTo - rangeFrom;
        for (int i = 0; i < length; i++) {
            randomIntegersArray[i] = random.nextInt(range) + rangeFrom;
        }
        return randomIntegersArray;
    }

    private static String setToLength(String string, int newLength) {

        if (newLength < 2 || newLength > 20) {
            return "Length less or more than it must be";
        }
        if (string.length() < newLength) {
            StringBuilder nameBuilder = new StringBuilder(string).append(" ");
            String[] millis = "millis" .split("");
            int i = 0;
            while (nameBuilder.length() < newLength) {
                if (i < millis.length && string.matches("\\d+")) {
                    nameBuilder.append(millis[i++]);
                    continue;
                }
                nameBuilder.append("_");
            }
            string = nameBuilder.toString();
        } else if (string.length() > newLength) {
            string = string.substring(0, newLength);
        }
        return string;
    }

    public static void printResult(String name, int[] integers, Calendar startTime, Calendar endTime) {

        String check = checkSortedArray(integers)?"right":"wrong";

        name = setToLength(name, 10);

        long sortedTime = endTime.getTimeInMillis() - startTime.getTimeInMillis();

        String time = setToLength(sortedTime + "", 10);

        StringBuilder timeParamsForOutput = new StringBuilder();

        timeParamsForOutput
                .append(name)
                .append(" ")
                .append("Sorted ")
                .append(check)
                .append(" time - ")
                .append(time)
                .append(" ");

        System.out.println(timeParamsForOutput);
    }

    public static void printResult(String name, int[] integers, Calendar startTime, Calendar endTime, Map<String, Integer> mapTime) {

        String check = checkSortedArray(integers)?"right":"wrong";

        name = setToLength(name, 10);

        long sortedTime = endTime.getTimeInMillis() - startTime.getTimeInMillis();

        String time = setToLength(sortedTime + "", 10);

        StringBuilder timeParamsForOutput = new StringBuilder();

        String averageString = setToLength((String.valueOf(mapTime.get("averageTime"))), 10);

        timeParamsForOutput
                .append(name)
                .append(" ")
                .append("Sorted ")
                .append(check)
                .append(" time - ")
                .append(time)
                .append(" ")
                .append("average time - ")
                .append(averageString)
                .append(" ")
                .append("Max - ")
                .append(mapTime.get("maxTime"))
                .append(" ")
                .append("Min -")
                .append(mapTime.get("minTime"));


        System.out.println(timeParamsForOutput);
    }

}
