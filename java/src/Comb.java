//  author:  ValitovGaziz
//  date:    10.01.2022
//  project: dsa-in-java

import java.util.Arrays;
import java.util.Calendar;

public class Comb {

    private static final double FACTOR = 1.247;

    public static void sort(int[] integers) {

        // Printing name of sorting algorithm.
        System.out.print("Comb      ");

        int step = (int) (integers.length * FACTOR);

        boolean isSorted = false;

        int tempInt;

        int[] unordered = Arrays.stream(integers).unordered().toArray();

        // Show array for sorting
        // System.out.println("Non sorted entered array "+Arrays.toString(integers));
        // Measure start time.
        Calendar timeStart = Calendar.getInstance();

        // Sort
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i + step < integers.length; i++) {
                if(integers[i] < integers[i + step]) {
                    tempInt = integers[i];
                    integers[i] = integers[i + 1];
                    integers[i + 1] = tempInt;
                    isSorted = false;
                }
            }
        }

        // Measure end time.
        Calendar timeEnd = Calendar.getInstance();
        // Show the sorted array
        // System.out.println("Sorted by bubble sort array "+Arrays.toString(integers));
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
