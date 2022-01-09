//  author:  ValitovGaziz
//  date:    09.01.2022
//  project: dsa-in-java

import java.util.Arrays;
import java.util.Calendar;

public class ShakerSorting {
    public static void sort(int[] integers) {
        System.out.println("Non sorted entered array " + Arrays.toString(integers));

        // Measuring the start time.
        Calendar timeStart = Calendar.getInstance();

        int num;
        boolean isSorted = false;
        int i = 0;
        while (!isSorted) {
            isSorted = true;
            if (i == 0) {
                for ( i = 0; i < integers.length - 1; i++) {
                    if (integers[i] > integers[i + 1]) {
                        num = integers[i];
                        integers[i] = integers[i + 1];
                        integers[i + 1] = num;
                        isSorted = false;
                    }
                }
            } else {
                for ( ; 0 < i; i--) {
                    if (integers[i] < integers[i - 1]) {
                        num = integers[i];
                        integers[i] = integers[i - 1];
                        integers[i - 1] = num;
                        isSorted = false;
                    }
                }
            }
        }
        // Measuring the end time.
        Calendar timeEnd = Calendar.getInstance();
        System.out.println("Sorted by shaker sort array " + Arrays.toString(integers));
        // Show the sorting time.
        System.out.println("Sorted by - " + (timeEnd.getTimeInMillis() - timeStart.getTimeInMillis()) + " millis");
    }
}
