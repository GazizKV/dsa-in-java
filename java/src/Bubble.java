//  author:  ValitovGaziz
//  date:    09.01.2022
//  project: dsa-in-java

import java.util.Arrays;
import java.util.Calendar;

public class Bubble {
    public static void sort(int[] integers) {
        System.out.println("Non sorted entered array "+Arrays.toString(integers));
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
        Calendar timeEnd = Calendar.getInstance();
        System.out.println("Sorted by bubble sort array "+Arrays.toString(integers));
        System.out.println("Sorted by - " + (timeEnd.getTimeInMillis() - timeStart.getTimeInMillis()) + " millis");
    }
}
