//  author:  ValitovGaziz
//  date:    12.01.2022
//  project: dsa-in-java

import java.util.Calendar;

public class Selection {

    private static final String name = "Select";

    public static void sort(int[] integers) {

        Calendar timeStart = Calendar.getInstance(); // Measure start time.

        // Sort
        for (int i = 0; i < integers.length; i++) {
            // Finding next min value into array integers.
            int indexOfMinValueInSubArray = Functions.minVal(integers, i, integers.length);
            // Swap values into integers array.
            Functions.swapValues(integers, i, indexOfMinValueInSubArray);
        }

        Calendar timeEnd = Calendar.getInstance(); // Measure end time.

        Functions.printResult(name, integers, timeStart, timeEnd);

    }

}
