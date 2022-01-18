//  author:  ValitovGaziz
//  date:    10.01.2022
//  project: dsa-in-java

import java.util.Calendar;
import java.util.Map;

public class Comb implements Sorting {

    private final SortingType type = SortingType.COMB;

    private final String NAME = "Comb";

    private final double FACTOR = 1.247;

    private final Functions functions = new Functions();


    public void sort(int[] integers) {

        Calendar timeStart = Calendar.getInstance(); // Measure start time.

        innerSort(integers); // Sort

        Calendar timeEnd = Calendar.getInstance(); // Measure end time.


        Map<String, Integer> mapTime = functions.averageTimeSort(this);
                                        // Measure average, min and max sorting time

        functions.printResult(NAME, integers, timeStart, timeEnd, mapTime); // Print result

    }

    public void innerSort(int[] integers) {

        int step = (int) (integers.length / FACTOR);

        boolean isSorted = false;

        while (!isSorted) {

            isSorted = true;

            for (int i = 0; i + step < integers.length; ++i) {
                if (integers[i] > integers[i + step]) {
                    functions.swapValues(integers, i, i + step);
                    isSorted = false;
                }
            }

            step = (int) (step / FACTOR);

            if (step <= 1) step = 1;

        }

    }

}
