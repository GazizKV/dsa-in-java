//  author:  ValitovGaziz
//  date:    14.01.2022
//  project: dsa-in-java

import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;

public class Merge implements Sorting {

    private final SortingType type = SortingType.MERGE;

    private final String name = "Merge";

    private final Functions functions = new Functions();


    private void sortImpl(int[] integers, int[] arrayBuffer, int leftIndex, int rightIndex) {
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

            for (int i = leftIndex; i <= rightIndex; i++) {
                integers[i] = arrayBuffer[i];
            }

        }
    }

    public void sort(int[] integers) {

        if (integers.length > 1) {

            int[] bufferArray = new int[integers.length];


            Calendar timeStart = Calendar.getInstance(); // Measure start time.

            sortImpl(integers, bufferArray, 0, integers.length - 1); // Sort

            Calendar timeEnd = Calendar.getInstance(); // Measure end time.

            Map<String, Integer> timeMap = functions.averageTimeSort(this);
                        // Measure average, max and min value of sort time

            functions.printResult(name, integers, timeStart, timeEnd, timeMap); // Print result

        } else {
            System.out.println("Array size is less than 2 or empty");
        }
    }

    @Override
    public void innerSort(int[] integers) {
        sort(integers);
    }
}
