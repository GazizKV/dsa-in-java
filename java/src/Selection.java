//  author:  ValitovGaziz
//  date:    12.01.2022
//  project: dsa-in-java

import java.util.Arrays;
import java.util.Calendar;

public class Selection {

    public static void sort(int[] integers) {

        // Printing name of sorting algorithm.
        System.out.print("Selection      ");

        // Show array for sorting
        // System.out.println("Non sorted entered array "+Arrays.toString(integers));
        // Measure start time.
        Calendar timeStart = Calendar.getInstance();

        // Sort
        for (int i = 0; i < integers.length; i++) {
            // Finding next min value into array integers.
            int indexOfMinVlueInSubArray = Functions.minVal(integers, i, integers.length);
            // Swap values into integers array.
            Functions.swap(integers, i, indexOfMinVlueInSubArray);
        }

        // Measure end time.
        Calendar timeEnd = Calendar.getInstance();
        // Show the sorted array
        // System.out.println("Sorted by insertion sort array "+Arrays.toString(integers));
        // Show time
        System.out.print("Start time = " + timeStart.getTimeInMillis() + "  ");
        System.out.print("Ent time = " + timeEnd.getTimeInMillis() + "  ");
        System.out.println("Sorted by - " + (timeEnd.getTimeInMillis() - timeStart.getTimeInMillis()) + " millis");

    }

}
