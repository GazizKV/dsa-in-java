//  author:  ValitovGaziz
//  date:    09.01.2022
//  project: dsa-in-java

import java.util.Calendar;
import java.util.Map;

public class Shaker implements Sorting {

    private final SortingType sortingType = SortingType.SHAKER;
    private final String name = "Shaker";

    private final Functions functions = new Functions();

    public void sort(int[] integers) {

        Calendar timeStart = Calendar.getInstance(); // Measuring the start time.

        innerSort(integers); // Sort

        Calendar timeEnd = Calendar.getInstance(); // Measuring the end time.

        Map<String, Integer> timeMap = functions.averageTimeSort(this);
                                                    // Measure average, max and min sorting time

        functions.printResult(name, integers, timeStart, timeEnd, timeMap); // Print result
    }

    @Override
    public int[] innerSort(int[] integers) {
        int num;
        boolean isSorted = false;
        int i;
        while (!isSorted) {
            isSorted = true;
            for (i = 0; i < integers.length - 1; i++) {
                if (integers[i] > integers[i + 1]) {
                    num = integers[i];
                    integers[i] = integers[i + 1];
                    integers[i + 1] = num;
                    isSorted = false;
                }
            }
            for (; 0 < i; i--) {
                if (integers[i] < integers[i - 1]) {
                    num = integers[i];
                    integers[i] = integers[i - 1];
                    integers[i - 1] = num;
                    isSorted = false;
                }
            }
        }

        return integers;

    }
}
