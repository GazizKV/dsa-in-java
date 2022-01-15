

//  author:  ValitovGaziz
//  date:    11.01.2022
//  project: dsa-in-java

import java.util.Calendar;

public class Insertion {

    public static void sort(int[] integers) {

        // Printing name of sorting algorithm.
        System.out.print("Insertion ");

        boolean isSorted = false;

        // Show array for sorting
        // System.out.println("Non sorted entered array "+Arrays.toString(integers));

        // Measure start time.
        Calendar timeStart = Calendar.getInstance();

        // Sort
        for (int i = 1; i < integers.length; i++) {
            int x = integers[i];
            int j = i;
            while (j > 0 && integers[i] > x) {
                integers[i] = integers[i - 1];
                --j;
            }
            integers[j] = x;
        }

        // Measure end time.
        Calendar timeEnd = Calendar.getInstance();

        // Show the sorted array
        // System.out.println("Sorted by insertion sort array "+Arrays.toString(integers));

        // Show time
        System.out.print("Start time = " + timeStart.getTimeInMillis() + "  ");
        System.out.print("Ent time = " + timeEnd.getTimeInMillis() + "  ");
        System.out.print("Sorted by - " + (timeEnd.getTimeInMillis() - timeStart.getTimeInMillis()) + " millis");


        if (Functions.checkSortedArray(integers)) {
            System.out.println("Array sorted right");
        } else {
            System.out.println("Array sorted not right");
        }
    }
}
