//  author:  ValitovGaziz
//  date:    09.01.2022
//  project: dsa-in-java

import java.util.Arrays;
import java.util.Calendar;

public class Bubble {

    private static final String name = "Bubble";

    public static void sort(int[] integers) {

        Calendar timeStart = Calendar.getInstance(); // Measure start time.
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
        Calendar timeEnd = Calendar.getInstance(); // Measure end time.

        Functions.printResult(name, integers, timeStart, timeEnd);
    }
}
