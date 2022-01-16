

//  author:  ValitovGaziz
//  date:    12.01.2022
//  project: dsa-in-java

import java.util.Calendar;
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
        int result = Integer.MIN_VALUE;
        int resultIndex = 0;
        for (int i = from; i < to; i++) {
            if (result < array[i]) {
                result = array[i];
                resultIndex = i;
            }
        }
        return resultIndex;
    }

    public static void printArray(int[] array) {
        int arrayLength = array.length;
        if (array.length < 50) {
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
        }
    }

    public static boolean checkSortedArray(int[] array) {
        boolean result = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                result = false;
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

    private static String setToLength(String string, int newLength) {

        if (newLength < 2 || newLength > 20) {
            return "Length less or more than it must be";
        }
        if (string.length() < newLength) {
            StringBuilder nameBuilder = new StringBuilder(string);
            while (nameBuilder.length() < newLength) {
                nameBuilder.append("_");
            }
            string = nameBuilder.toString();
        } else if (string.length() > newLength) {
            string = string.substring(0, newLength - 1);
        }
        return string;
    }

    public static void printResult(String name, int[] integers, Calendar startTime, Calendar endTime) {

        name = setToLength(name, 10);

        long sortedTime = endTime.getTimeInMillis() - startTime.getTimeInMillis();

        String time = setToLength(sortedTime + "", 10);

        StringBuilder timeParamsForOutput = new StringBuilder();
        timeParamsForOutput
                .append(name)
                .append("Start = ")
                .append(startTime.getTimeInMillis())
                .append("  ")
                .append("End = ")
                .append(endTime.getTimeInMillis())
                .append("  ")
                .append("Sorted by - ")
                .append(time)
                .append(" millis");

        if (checkSortedArray(integers)) {
            timeParamsForOutput
                    .append("\t")
                    .append("right");
        } else {
            timeParamsForOutput
                    .append("\t")
                    .append("wrong");
        }
        System.out.println(timeParamsForOutput);
    }
}
