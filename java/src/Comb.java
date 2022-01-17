//  author:  ValitovGaziz
//  date:    10.01.2022
//  project: dsa-in-java

import java.util.Calendar;

public class Comb {

    private static final String NAME = "Comb";

    private static final double FACTOR = 1.247;

    public static void sort(int[] integers) {

        int step = (int) (integers.length / FACTOR);

        boolean isSorted = false;

        Calendar timeStart = Calendar.getInstance(); // Measure start time.

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i + step < integers.length; ++i) {
                if (integers[i] > integers[i + step]) {
                    Functions.swapValues(integers, i, i + step);
                    isSorted = false;
                }
            }
            step = (int) (step / FACTOR);
            if (step <= 1) step = 1;
        }

        Calendar timeEnd = Calendar.getInstance(); // Measure end time.

        Functions.printResult(NAME, integers, timeStart, timeEnd);

    }
}
