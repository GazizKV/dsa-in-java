//  author:  ValitovGaziz
//  date:    10.01.2022
//  project: dsa-in-java

import java.util.Arrays;
import java.util.Calendar;

public class Comb {

    private static final String name = "Comb";

    private static final double FACTOR = 1.247;

    public static void sort(int[] integers) {

        int step = (int) (integers.length * FACTOR);

        boolean isSorted = false;

        int tempInt;

        Calendar timeStart = Calendar.getInstance(); // Measure start time.

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i + step < integers.length; i++) {
                if(integers[i] < integers[i + step]) {
                    tempInt = integers[i];
                    integers[i] = integers[i + 1];
                    integers[i + 1] = tempInt;
                    isSorted = false;
                }
            }
        }

        Calendar timeEnd = Calendar.getInstance(); // Measure end time.

        Functions.printResult(name, integers, timeStart, timeEnd);
    }
}
