//  author:  ValitovGaziz
//  date:    09.01.2022
//  project: dsa-in-java

import java.util.Calendar;
import java.util.Map;

public class Bubble implements Sorting {

    private final SortingType type = SortingType.BUBBLE;

    private final Functions functions = new Functions();

    private final String NAME = "Bubble";

    public void sort(int[] integers) {

        Calendar timeStart = Calendar.getInstance(); // Measure start time.
        innerSort(integers); // Sort
        Calendar timeEnd = Calendar.getInstance(); // Measure end time.

        Map<String, Integer> mapTime = functions.averageTimeSort(this);
                                                // Measure average, min and max sorting time

        functions.printResult(NAME, integers, timeStart, timeEnd, mapTime); // Print result
    }

    @Override
    public int[] innerSort(int[] integers) {

        int num;

        boolean isSorted = false;

        while (!isSorted) {

            isSorted = true;

            for (int i = 0; i < integers.length - 1; i++) {
                if (integers[i] > integers[i + 1]) {
                    functions.swapValues(integers, i, i + 1);
                    isSorted = false;
                }
            }

        }

        return integers;
    }

}
