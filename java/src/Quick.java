

//  author:  ValitovGaziz
//  date:    13.01.2022
//  project: dsa-in-java

import java.util.Calendar;

public class Quick {

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

        // Printing name of sorting algorithm.
        System.out.print("Quick     ");

        // Print first 10 values from integers array
        // Functions.printArray(integers);

        // Measure start time.
        Calendar timeStart = Calendar.getInstance();

        quickSort(integers);

        // Measure end time.
        Calendar timeEnd = Calendar.getInstance();


        // Print first 10 values from integers array
        // Functions.printArray(integers);

        // Build stringBuilder for show the result
        String timeParamsForOutput = "Start time = " + timeStart.getTimeInMillis() + "  " +
                "Ent time = " + timeEnd.getTimeInMillis() + "  " +
                "Sorted by - " + (timeEnd.getTimeInMillis() - timeStart.getTimeInMillis()) + " millis";

        // Printing result of sorting time
        System.out.print(timeParamsForOutput);


        if (Functions.checkSortedArray(integers)) {
            System.out.println("Array sorted right");
        } else {
            System.out.println("Array sorted not right");
        }
    }

}
