

//  author:  ValitovGaziz
//  date:    12.01.2022
//  project: dsa-in-java

import java.util.*;

public class Functions {

    private final Random random = new Random();

    public void swapValues(int[] array, int x, int y) {
        int swap;
        swap = array[y];
        array[y] = array[x];
        array[x] = swap;
    }

    public int minVal(int[] array, int from, int to) {
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

    public void printArray(int[] array) {
        int arrayLength = array.length;
        if (array.length < 51) {
            for (int j : array) {
                System.out.print(j + " ");
            }
            System.out.println("\nArray length equal to " + array.length +
                    ", numbers in range between " + Arrays.stream(array).min().getAsInt() +
                    " and " + Arrays.stream(array).max().getAsInt());
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

    public boolean checkSortedArray(int[] array) {
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


    public int[] generate() {

        int length = Main.LENGTH;

        int[] randomIntegersArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomIntegersArray[i] = random.nextInt();
        }
        return randomIntegersArray;
    }

    public int[] generate(int length, int rangeFrom, int rangeTo) {

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

    private String setToLength(String string, int newLength) {

        if (newLength < 2 || newLength > 20) {
            return "Length less or more than it must be";
        }
        if (string.length() < newLength) {
            StringBuilder nameBuilder = new StringBuilder(string).append(" ");
            String[] millis = "m" .split("");
            int i = 0;
            while (nameBuilder.length() < newLength) {
                if (i < millis.length && string.matches("\\d+")) {
                    nameBuilder.append(millis[i++]);
                    continue;
                }
                nameBuilder.append(" ");
            }
            string = nameBuilder.toString();
        } else if (string.length() > newLength) {
            string = string.substring(0, newLength);
        }
        return string;
    }

    public void printResult(String name, int[] integers, Calendar startTime, Calendar endTime) {

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

    public void printResult(String name, int[] integers, Calendar startTime, Calendar endTime, Map<String, Integer> mapTime) {

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
                .append("average = ")
                .append(averageString)
                .append(" ")
                .append("Max = ")
                .append(setToLength(String.valueOf(mapTime.get("maxTime")), 10))
                .append(" ")
                .append("Min = ")
                .append(setToLength(String.valueOf(mapTime.get("minTime")), 10))
                .append(" wrongTimes = ")
                .append(mapTime.get("wrongTimes"));


        System.out.println(timeParamsForOutput);
    }


    public Map<String, Integer> averageTimeSort(Sorting sort) {

        int times = Main.TIMES;

        Map<String, Integer> timeMap = new HashMap<>();

        int time;

        int sumOfSortedTimes = 0;

        int maxTime = Integer.MIN_VALUE;

        int minTime = Integer.MAX_VALUE;

        int wrong = 0;

        for (int i = 0; i < times; i++) {

            Calendar timeStart = Calendar.getInstance(); // Measure start time.
            int[] integers = sort.innerSort(generate());// Sort
            Calendar timeEnd = Calendar.getInstance(); // Measure end time.

            if(!checkSortedArray(integers)) ++wrong;

            time = (int) (timeEnd.getTimeInMillis() - timeStart.getTimeInMillis());
            if (maxTime < time) {
                maxTime = time;
            } else if (minTime > time) {
                minTime = time;
            }
            sumOfSortedTimes += time;

        }

        timeMap.put("minTime", minTime);
        timeMap.put("maxTime", maxTime);

        timeMap.put("averageTime", sumOfSortedTimes / times);

        timeMap.put("wrongTimes", wrong);

        return timeMap;

    }

}
