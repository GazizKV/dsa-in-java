//  author:  ValitovGaziz
//  date:    12.01.2022
//  project: dsa-in-java

import java.util.Calendar;
import java.util.Map;

public class Selection implements Sorting {

    private final SortingType type = SortingType.SELECTION;
    private final String name = "Select";

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
    public int[] innerSort(int[] integers) {
        for (int i = 0; i < integers.length; i++) {

            // Finding next min value into array integers.
            int indexOfMinValueInSubArray = functions.minVal(integers, i, integers.length);


            // Swap values into integers array.
            functions.swapValues(integers, i, indexOfMinValueInSubArray);

        }

        return integers;

    }
}
