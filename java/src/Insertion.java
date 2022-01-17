

//  author:  ValitovGaziz
//  date:    11.01.2022
//  project: dsa-in-java

import java.util.Calendar;

public class Insertion {

    private static final String name = "Insert";

    public static void sort(int[] integers) {

        Calendar timeStart = Calendar.getInstance(); // Measure start time.

        // Sort
        for (int i = 1; i < integers.length; i++) {
            int x = integers[i];
            int j = i;
            while (j > 0 && integers[j - 1] > x) {
                integers[i] = integers[i - 1];
                --j;
            }
            integers[j] = x;
        }

        Calendar timeEnd = Calendar.getInstance(); // Measure end time.

        Functions.printResult(name, integers, timeStart, timeEnd);

    }
}
