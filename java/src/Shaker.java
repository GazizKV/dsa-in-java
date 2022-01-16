//  author:  ValitovGaziz
//  date:    09.01.2022
//  project: dsa-in-java

import java.util.Calendar;

public class Shaker {

    private static final String name = "Shaker";

    public static void sort(int[] integers) {

        Calendar timeStart = Calendar.getInstance(); // Measuring the start time.

        // Sort
        int num;
        boolean isSorted = false;
        int i;
        while (!isSorted) {
            isSorted = true;
            for (i = 0; i < integers.length - 1; i++) {
                if (integers[i] > integers[i + 1]) {
                    num = integers[i];
                    integers[i] = integers[i + 1];
                    integers[i + 1] = num;
                    isSorted = false;
                }
            }
            for (; 0 < i; i--) {
                if (integers[i] < integers[i - 1]) {
                    num = integers[i];
                    integers[i] = integers[i - 1];
                    integers[i - 1] = num;
                    isSorted = false;
                }
            }
        }

        Calendar timeEnd = Calendar.getInstance(); // Measuring the end time.

        Functions.printResult(name, integers, timeStart, timeEnd);
    }
}
