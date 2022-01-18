//  author:  ValitovGaziz
//  date:    09.01.2022
//  project: dsa-in-java

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Bubble {

    private static final String name = "Bubble";

    public static void sort(int[] integers) {

        Calendar timeStart = Calendar.getInstance(); // Measure start time.
        innerSort(integers);
        Calendar timeEnd = Calendar.getInstance(); // Measure end time.

        Map<String, Integer> mapTime = averageTimeSort(Main.TIMES);

        Functions.printResult(name, integers, timeStart, timeEnd, mapTime);
    }

    private static void innerSort(int[] integers) {

        int num;

        boolean isSorted = false;

        while (!isSorted) {

            isSorted = true;

            for (int i = 0; i < integers.length - 1; i++) {
                if (integers[i] > integers[i + 1]) {
                    num = integers[i];
                    integers[i] = integers[i + 1];
                    integers[i + 1] = num;
                    isSorted = false;
                }
            }

        }

    }

    private static Map<String, Integer> averageTimeSort(int times) {

        Map<String, Integer> timeMap = new HashMap<>();

        int[] integers;

        int time;

        int sumOfSortedTimes = 0;

        int maxTime = Integer.MIN_VALUE;

        int minTime = Integer.MAX_VALUE;

        for (int i = 0; i < times; i++) {
            integers = Functions.generate(Main.LENGTH);
            Calendar timeStart = Calendar.getInstance(); // Measure start time.
            innerSort(integers);
            Calendar timeEnd = Calendar.getInstance(); // Measure end time.
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

        return timeMap;

    }
}
