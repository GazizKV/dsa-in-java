

//  author:  ValitovGaziz
//  date:    13.01.2022
//  project: dsa-in-java

import java.util.Calendar;
import java.util.Map;

public class Quick implements Sorting {

    private final SortingType type = SortingType.QUICK;
    private final String name = "Quick";

    private final Functions functions = new Functions();

    public void sort(int[] integers) {

        Calendar timeStart = Calendar.getInstance(); // Measure start time.

        innerSort(integers); // Sort

        Calendar timeEnd = Calendar.getInstance(); // Measure end time.

        Map<String, Integer> timeMap = functions.averageTimeSort(this);
                                                // Measure average, max and min sorting time

        functions.printResult(name, integers, timeStart, timeEnd, timeMap); // Print result

    }

    @Override
    public void innerSort(int[] array) {
        if (array.length > 1) {
            quickSortImpl(array, 0, array.length - 1);
        }
    }


    private int partition(int[] array, int leftValueIndex, int reeghtValueIndex) {

        int partitionValue = array[reeghtValueIndex];
        int partitionIndex = leftValueIndex;

        for (int i = leftValueIndex; i < reeghtValueIndex; i++) {
            if (array[i] <= partitionValue) {
                functions.swapValues(array, i, partitionIndex);
                ++partitionIndex;
            }
        }

        functions.swapValues(array, partitionIndex, reeghtValueIndex);
        return partitionIndex;
    }

    private void quickSortImpl(int[] array, int leftValue, int rightValue) {
        if (leftValue < rightValue) {
            int partitionIndex = partition(array, leftValue, rightValue);
            quickSortImpl(array, leftValue, partitionIndex - 1);
            quickSortImpl(array, partitionIndex + 1, rightValue);
        }
    }

}
