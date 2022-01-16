

//  author:  ValitovGaziz
//  date:    13.01.2022
//  project: dsa-in-java

import java.util.Calendar;

public class Quick {

    private static final String name = "Quick";

    private static int partition(int[] array, int leftValueIndex, int reeghtValueIndex) {

        int partitionValue = array[reeghtValueIndex];
        int partitionIndex = leftValueIndex;

        for (int i = leftValueIndex; i < reeghtValueIndex; i++) {
            if (array[i] <= partitionValue) {
                Functions.swapValues(array, i, partitionIndex);
                ++partitionIndex;
            }
        }

        Functions.swapValues(array, partitionIndex, reeghtValueIndex);
        return partitionIndex;
    }

    private static void quickSortImpl(int[] array, int leftValue, int rightValue) {
        if (leftValue < rightValue) {
            int partitionIndex = partition(array, leftValue, rightValue);
            quickSortImpl(array, leftValue, partitionIndex - 1);
            quickSortImpl(array, partitionIndex + 1, rightValue);
        }
    }

    private static void quickSort(int[] array) {
        if (array.length > 1) {
            quickSortImpl(array, 0, array.length - 1);
        }
    }

    public static void sort(int[] integers) {

        Calendar timeStart = Calendar.getInstance(); // Measure start time.

        quickSort(integers);

        Calendar timeEnd = Calendar.getInstance(); // Measure end time.

        Functions.printResult(name, integers, timeStart, timeEnd);

    }

}
