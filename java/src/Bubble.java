//  author:  ValitovGaziz
//  date:    09.01.2022
//  project: dsa-in-java

import java.util.Arrays;
import java.util.Calendar;

public class Bubble {
    public static void sort(int[] integers) {

        // Printing name of sorting algorithm.
        System.out.print("Bubble    ");

        // Show array for sorting
        // System.out.println("Non sorted entered array "+Arrays.toString(integers));
        // Measure start time.
        Calendar timeStart = Calendar.getInstance();
        int num;
        boolean isSorted = false;
        while(!isSorted)
        {
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
        // Measure end time.
        Calendar timeEnd = Calendar.getInstance();
        // Show the sorted array
        //  System.out.println("Sorted by bubble sort array "+Arrays.toString(integers));
        System.out.print("Start time = " + timeStart.getTimeInMillis() + "  ");
        System.out.print("Ent time = " + timeEnd.getTimeInMillis() + "  ");
        // Show time
        System.out.println("Sorted by - " + (timeEnd.getTimeInMillis() - timeStart.getTimeInMillis()) + " millis");
    }
}
