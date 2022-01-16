//  author:  ValitovGaziz
//  date:    14.01.2022
//  project: dsa-in-java

import java.util.Arrays;
import java.util.Calendar;

public class Merge {

    private static final String name = "Merge";

    private static void sortImpl(int[] integers, int[] arrayBuffer, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middle = (leftIndex + rightIndex) / 2;
            sortImpl(integers, arrayBuffer, leftIndex, middle);
            sortImpl(integers, arrayBuffer, middle + 1, rightIndex);

            int k = leftIndex;
            for (int i = leftIndex, j = middle + 1; i <= middle || j <= rightIndex; ) {
                if (j > rightIndex || (i <= middle && integers[i] < integers[j])) {
                    arrayBuffer[k] = integers[i];
                    ++i;
                } else {
                    arrayBuffer[k] = integers[j];
                    ++j;
                }
                ++k;
            }
            for (int i = leftIndex; i < rightIndex; i++) {
                integers[i] = arrayBuffer[i];
            }
        }
    }

    public static void sort(int[] integers) {

        if (integers.length > 1) {
            int[] bufferArray = new int[integers.length];

            Calendar timeStart = Calendar.getInstance(); // Measure start time.

            sortImpl(integers, bufferArray, 0, integers.length - 1); // Sort

            Calendar timeEnd = Calendar.getInstance(); // Measure end time.

            Functions.printResult(name, integers, timeStart, timeEnd);

        } else {
            System.out.println("Array size is less than 2 or empty");
        }
    }
}
