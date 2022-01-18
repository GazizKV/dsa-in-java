

//  author:  ValitovGaziz
//  date:    11.01.2022
//  project: dsa-in-java

import java.util.Calendar;
import java.util.Map;

public class Insertion implements Sorting {

    private final SortingType type = SortingType.INSERTION;

    private final String name = "Insert";

    private final Functions functions = new Functions();


    public void sort(int[] integers) {

        Calendar timeStart = Calendar.getInstance(); // Measure start time.

        innerSort(integers); // Sort

        Calendar timeEnd = Calendar.getInstance(); // Measure end time.

        Map<String, Integer> timeMap = functions.averageTimeSort(this);
                                            // Measure average, min and max sorting time

        functions.printResult(name, integers, timeStart, timeEnd, timeMap); // Print result

    }

    @Override
    public void innerSort(int[] integers) {
        for (int i = 1; i < integers.length; i++) {
            int x = integers[i];
            int j = i;
            while (j > 0 && integers[j - 1] > x) {
                integers[i] = integers[i - 1];
                --j;
            }
            integers[j] = x;
        }
    }
}
